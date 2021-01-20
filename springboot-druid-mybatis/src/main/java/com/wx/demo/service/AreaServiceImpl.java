package com.wx.demo.service;

import com.wx.demo.bean.ConsultConfigArea;
import com.wx.demo.dao.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
}
