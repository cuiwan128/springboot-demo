package com.wx.demo.service;

import com.wx.demo.bean.ConsultConfigArea;

import java.util.List;
import java.util.Map;

public interface AreaService {
    public List<ConsultConfigArea> qryAreaFromBase(Map param);

    public List<ConsultConfigArea> qryArea(Map param);

    public int saveArea(ConsultConfigArea area);

    public int saveAreaToBase(ConsultConfigArea area);

    public String queryData(String id);

    public String putCache(String id);

}
