package com.example.demo.自定义配置2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class 调用配置项 {
    @Autowired
    private WebSiteProperties website;
    @RequestMapping("/num4")
    public String print(){
        return website.getName()+website.getWebsite()+website.getLanguage();
    }
}
