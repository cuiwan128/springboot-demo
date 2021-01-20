package com.wx.demo.service;

import com.alibaba.druid.support.json.JSONUtils;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wx.demo.bean.ConsultConfigArea;
import com.wx.demo.dao.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    CommonMapper commonMapper;

    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<ConsultConfigArea> qryAreaFromBase(Map param) {
        // TODO Auto-generated method stub
        return commonMapper.qryArea(param);
    }
    public List<ConsultConfigArea> qryArea(Map param) {
        List<ConsultConfigArea> consultConfigAreas = commonMapper.qryArea(param);
        return consultConfigAreas;
    }

    @Transactional
    public int saveArea(ConsultConfigArea area) {
        int count = commonMapper.saveArea(area);
        return count;
    }

    @Transactional
    public int saveAreaToBase(ConsultConfigArea area) {
        // TODO Auto-generated method stub
        return commonMapper.saveArea(area);
    }

    @Cacheable(cacheNames="redisCache",key="'wx'+#id")
    @Override
    public String queryData(String id) {
        Gson gson = new Gson();
        System.out.println("11111111111111111111");
        List<ConsultConfigArea> listArea = commonMapper.queryAreaById(id);
        return gson.toJson(listArea);
    }
    @CachePut(cacheNames="redisCache",key="'wx'+#id")
    @Override
    public String putCache(String id) {
        Gson gson = new Gson();
        System.out.println("22222222222222222222");
        List<ConsultConfigArea> listArea = commonMapper.queryAreaById(id);
        return gson.toJson(listArea);
    }
}
