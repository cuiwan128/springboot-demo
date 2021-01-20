package com.wx.demo.atomikos.service;

import com.wx.demo.atomikos.db1.dao.CommonMapper1;
import com.wx.demo.atomikos.db2.dao.CommonMapper2;
import com.wx.demo.bean.ConsultConfigArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.jta.JtaTransactionManager;

import javax.transaction.UserTransaction;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private CommonMapper1 commonMapper1;

    @Autowired
    private CommonMapper2 commonMapper2;

    @Autowired
    TransactionManager transactionManager;

    @Transactional
    public int saveArea(ConsultConfigArea area) {
        System.out.println(transactionManager);
        JtaTransactionManager jtaTransactionManager = (JtaTransactionManager)transactionManager;
        System.out.println(jtaTransactionManager.getUserTransaction());
        UserTransaction userTransaction = jtaTransactionManager.getUserTransaction();
        int count = commonMapper1.addArea(area);
        int count1 = commonMapper2.addArea(area);
        //if(true) throw new RuntimeException("xx");
        return count;
    }
}
