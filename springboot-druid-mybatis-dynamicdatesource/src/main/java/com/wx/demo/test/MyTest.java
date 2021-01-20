package com.wx.demo.test;

import com.wx.demo.ApplicationDMDS;
import com.wx.demo.bean.ConsultConfigArea;
//import com.wx.demo.mongo.MongoService;
//mport com.wx.demo.mongo.User;
import com.wx.demo.service.AreaService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.HashMap;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationDMDS.class)
@WebAppConfiguration
public class MyTest {

    private static final Logger logger = LoggerFactory.getLogger(MyTest.class);

    @Autowired
    AreaService areaService;

   /* @Autowired
    MongoService mongoService;*/

    @Test
    public void test1() {
        List<ConsultConfigArea> areas = areaService.qryArea(new HashMap());
        for (ConsultConfigArea area : areas) {
            logger.info(area.getAreaCode() + "   " + area.getAreaName() + "   "
                    + area.getState());
        }
    }

  /*  @Test
    public void mongoTest() {
        User user = new User();
        user.setUsername("jack");
        user.setPassword("123");
        user.setId("87");
        mongoService.save(user);
    }*/
}
