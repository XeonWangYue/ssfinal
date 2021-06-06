package top.xeonwang.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.xeonwang.model.DisctSimpleRetVO;
import top.xeonwang.service.BasicService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
public class BasicController {
    @Autowired
    private BasicService service;

    private ArrayList<String> array;
    private String[] disc = {  "宝山区",
            "崇明区",
            "奉贤区",
            "虹口区",
            "黄浦区",
            "嘉定区",
            "金山区",
            "境外来沪",
            "境外输入",
            "静安区",
            "闵行区",
            "浦东新区",
            "普陀区",
            "青浦区",
            "松江区",
            "外地来沪",
            "未知地区",
            "徐汇区",
            "杨浦区",
            "长宁区"};

    @RequestMapping("/hello")
    public String getData(){
        log.info("hello");
        String obj = JSON.toJSONString(service.getOne());
        return obj;
    }
    @RequestMapping("/discname")
    public String getDiscName(){
        List<String> discList= Arrays.asList(disc);
        String obj = JSON.toJSONString(discList);
        return obj;
    }
    @RequestMapping("/date/range")
    public String getDateRange(){
        log.info("date range");
        String obj = JSON.toJSONString(service.getDateRange());
        return obj;
    }


    @RequestMapping("/date/{dateString}")
    public String getOneDay(@PathVariable String dateString){
        log.info(dateString);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateString, formatter);
        String obj = JSON.toJSONString(service.getOneDay(date));
        return obj;
    }

    @RequestMapping("/disct/{disctString}")
    public String getOneDisct(@PathVariable String disctString){
        log.info(disctString);
        String obj = JSON.toJSONString(service.getOneDisct(disctString));
        return obj;
    }

    @RequestMapping("/disct/all")
    public String getAllDisctConfirmCount(){
        log.info("getAllDisct");
        List<DisctSimpleRetVO> temp = service.getAllDisct();
        List<String> discList= Arrays.asList(disc);
        Integer length = discList.size();
        List<List<DisctSimpleRetVO>> ret = new ArrayList<>();
        for(int i = 0;i<length;i++){
            ret.add(new ArrayList<>());
        }
        for(DisctSimpleRetVO vo : temp){

            for(int i=0;i<length;i++)
            {
                if(vo.getDisctName().equals(discList.get(i)))
                {
                    ret.get(i).add(vo);

                }
            }
        }

        return JSONObject.toJSONString(ret);
    }
    @RequestMapping("/disct")
    public String getAllDisct(){
        log.info("getAllDisct");
        List<DisctSimpleRetVO> temp = service.getAllDisct();
        List<LocalDate> range = service.getDateRange();
        Integer length = range.size();
        List<List<DisctSimpleRetVO>> ret = new ArrayList<>();
        for(int i = 0;i<length;i++){
            ret.add(new ArrayList<>());
        }
        for(DisctSimpleRetVO vo : temp){
            int index = Math.toIntExact(range.get(0).until(vo.getUpdateTime(), ChronoUnit.DAYS));
            ret.get(index).add(vo);
        }

        return JSONObject.toJSONString(ret);
    }
}
