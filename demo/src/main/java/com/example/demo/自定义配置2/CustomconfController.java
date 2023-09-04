package com.example.demo.自定义配置2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomconfController {
    @Autowired
    private Environment env;
    @Value("${com.example.demo.firstname}")
    private String firstName;
    @Value("${com.example.demo.secondname}")
    private String secondName;
    @RequestMapping("/num2")
    public String hello(){
        return "CustomConfig!"+firstName+secondName;
    }

}
