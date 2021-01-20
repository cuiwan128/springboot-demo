package com.wx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * springmvc 测试
 */
@Controller
public class TestController {

    /**
     *  springmvc 测试
     * @return
     */
    @ResponseBody
    @RequestMapping("/helloworld")
    public String test(){
        return "hello world";
    }

}
