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
import java.time.LocalDateTime;
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

    private List<LocalDate> dateRange = null;
    private List<List<DisctSimpleRetVO>> allDisctByName = null;
    private List<List<DisctSimpleRetVO>> allDisctByTime = null;
    private LocalDateTime updateDisctByName = LocalDateTime.now();
    private LocalDateTime updateDisctByTime = LocalDateTime.now();
    private LocalDateTime updateDateRange = LocalDateTime.now();
    private ArrayList<String> array;
    private String[] disc = {"宝山区",
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
    public String getData() {
        log.info("hello");
        String obj = JSON.toJSONString(service.getOne());
        return obj;
    }

    @RequestMapping("/discname")
    public String getDiscName() {
        List<String> discList = Arrays.asList(disc);
        String obj = JSON.toJSONString(discList);
        return obj;
    }

    @RequestMapping("/date/range")
    public String getDateRange() {
        log.info("date range");
        if (dateRange == null || LocalDateTime.now().isAfter(updateDateRange.plusHours(12))) {
            log.info("date range update");
            updateDateRange=LocalDateTime.now();
            dateRange = service.getDateRange();
        }
        log.info("date range return");
        return JSON.toJSONString(dateRange);
    }


    @RequestMapping("/date/{dateString}")
    public String getOneDay(@PathVariable String dateString) {
        log.info(dateString);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateString, formatter);
        String obj = JSON.toJSONString(service.getOneDay(date));
        return obj;
    }

    @RequestMapping("/disct/{disctString}")
    public String getOneDisct(@PathVariable String disctString) {
        log.info(disctString);
        String obj = JSON.toJSONString(service.getOneDisct(disctString));
        return obj;
    }

    @RequestMapping("/disct/all")
    public String getAllDisctByName() {
        log.info("getAllDisctByName");
        if(allDisctByName ==null || LocalDateTime.now().isAfter(updateDisctByName.plusHours(12))) {
            updateDisctByName=LocalDateTime.now();
            log.info("getAllDisctByName update");
            List<DisctSimpleRetVO> temp = service.getAllDisct();
            List<String> discList = Arrays.asList(disc);
            Integer length = discList.size();
            List<List<DisctSimpleRetVO>> ret = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                ret.add(new ArrayList<>());
            }
            for (DisctSimpleRetVO vo : temp) {
                for (int i = 0; i < length; i++) {
                    if (vo.getDisctName().equals(discList.get(i))) {
                        ret.get(i).add(vo);
                    }
                }
            }
            allDisctByName =ret;
        }
        log.info("getAllDisctByName return");
        return JSONObject.toJSONString(allDisctByName);
    }

    @RequestMapping("/disct")
    public String getAllDisctByTime() {
        log.info("getAllDisctByTime");
        if(allDisctByTime==null || LocalDateTime.now().isAfter(updateDisctByTime.plusHours(12))){
            updateDisctByTime=LocalDateTime.now();
            log.info("getAllDisctByTime update");
            List<DisctSimpleRetVO> temp = service.getAllDisct();
            List<LocalDate> range = service.getDateRange();
            Integer length = range.size();
            List<List<DisctSimpleRetVO>> ret = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                ret.add(new ArrayList<>());
            }
            for (DisctSimpleRetVO vo : temp) {
                int index = Math.toIntExact(range.get(0).until(vo.getUpdateTime(), ChronoUnit.DAYS));
                ret.get(index).add(vo);
            }
            allDisctByTime=ret;
        }
        log.info("getAllDisctByTime return");
        return JSONObject.toJSONString(allDisctByTime);
    }
}
