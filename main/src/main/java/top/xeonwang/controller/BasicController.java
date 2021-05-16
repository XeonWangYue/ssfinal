package top.xeonwang.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.xeonwang.model.DisctRetVO;
import top.xeonwang.service.BasicService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class BasicController {
    @Autowired
    private BasicService service;

    private ArrayList<String> array;
    private String[] disc = {"宝山区","静安区","崇明区","奉贤区","嘉定区","金山区","黄浦区","长宁区","虹口区","闵行区","浦东新区","普陀区","青浦区","松江区","徐汇区","杨浦区"};

    @RequestMapping("/hello")
    public String getData(){
        log.info("hello");
        String obj = JSON.toJSONString(service.getOne());
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

    @RequestMapping("/disct")
    public String getAllDisct(){
        log.info("getAllDisct");
        List<DisctRetVO> temp = service.getAllDisct();
        List<LocalDate> range = service.getDateRange();
        Integer length = Math.toIntExact(range.get(0).until(range.get(1), ChronoUnit.DAYS))+1;
        log.info(range.get(0)+" "+range.get(1)+" day: "+length);
        List<List<DisctRetVO>> ret = new ArrayList<>();
        for(int i = 0;i<length;i++){
            ret.add(new ArrayList<>());
        }
        for(DisctRetVO vo : temp){
            int index = Math.toIntExact(range.get(0).until(vo.getUpdateTime(), ChronoUnit.DAYS));
            ret.get(index).add(vo);
        }

        return JSONObject.toJSONString(ret);
    }
}
