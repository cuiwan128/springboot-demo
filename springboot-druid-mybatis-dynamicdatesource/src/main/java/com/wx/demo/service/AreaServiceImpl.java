package com.wx.demo.service;

import com.wx.demo.bean.ConsultConfigArea;
import com.wx.demo.dao.CommonMapper;
import com.wx.demo.dynamicDataSource.TargetDataSource;
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
    @TargetDataSource(name = "ds2")
    public List<ConsultConfigArea> qryArea(Map param) {
        List<ConsultConfigArea> consultConfigAreas = commonMapper.qryArea(param);
        return consultConfigAreas;
    }

    @Transactional
    @TargetDataSource(name = "ds1")
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
