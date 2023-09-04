package com.example.demo.自定义配置2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentController {
    @Autowired
    private Environment env;
    @RequestMapping("/num3")
    public String print(){
        return "environment自定义配置"
                +env.getProperty("com.example.demo.firstname")+
                env.getProperty("com.example.demo.secondname");
    }
}
