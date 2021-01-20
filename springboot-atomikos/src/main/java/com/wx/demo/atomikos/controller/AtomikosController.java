package com.wx.demo.atomikos.controller;

import com.wx.demo.atomikos.service.AreaService;
import com.wx.demo.bean.ConsultConfigArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atomikos")
public class AtomikosController {

    @Autowired
    private AreaService areaService;

    @RequestMapping("/saveArea")
    public Integer saveArea() {
        ConsultConfigArea area = new ConsultConfigArea();
        area.setAreaCode("Jack8");
        area.setAreaName("Jack8");
        area.setState(1);
        return areaService.saveArea(area);
    }
}
