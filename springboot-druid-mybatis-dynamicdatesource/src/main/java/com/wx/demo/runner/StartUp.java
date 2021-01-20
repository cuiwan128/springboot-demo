package com.wx.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 应用程序启动完成后可以执行 run方法
 */
@Component
public class StartUp implements CommandLineRunner {

    public void run(String... args) throws Exception {
        System.out.println("------------------StartUp.run-------------------");
    }

}
