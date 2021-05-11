package top.xeonwang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.xeonwang.service.BasicService;

@RestController
public class BasicController {
    @Autowired
    private BasicService service;
    @RequestMapping("hello")
    public String getData(){
        return "hello";
    }
}
