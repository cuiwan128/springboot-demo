package com.wx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//@ServletComponentScan 会扫描加@WebServlet、@WebFilter、@WebListener这些注释的类
@ServletComponentScan(basePackages = {"com.wx.demo"})
public class ApplicationSFL {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationSFL.class);
    }
}
