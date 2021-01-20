package com.wx.demo;

import com.wx.demo.dataSource.DruidConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@MapperScan("com.wx.demo.dao")
@EnableConfigurationProperties({DruidConfig.class})
public class ApplicationDM {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationDM.class);
    }
}
