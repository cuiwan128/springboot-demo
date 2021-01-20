package com.wx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
//开启springmvc功能 扫包 视图转换 拦截器
//@EnableWebMvc
//扫controller包 类似与传统的配置中 开启扫包模式那段xml配置
//@ComponentScan("com.wx.demo.controller")
public class ApplicationBase {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationBase.class);
    }
}
