package com.example.demo.helloworld1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${com.example.demo.firstname}")
    private String firstName;
    @Value("${com.example.demo.secondname}")
    private String secondName;
    @RequestMapping("/hello")
    public String hello(){
        return "HelloWorld@Spring Boot !!!"+firstName+secondName;
    }
}
