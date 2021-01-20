package com.wx.demo.jpa.dao;

import com.wx.demo.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/*
* Student操作对象
* Integer主键类型
*
* */
public interface StudentDao extends JpaRepository<Student,Integer> {

}

