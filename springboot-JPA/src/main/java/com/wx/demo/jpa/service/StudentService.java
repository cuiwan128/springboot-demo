package com.wx.demo.jpa.service;

import com.wx.demo.jpa.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    Student findById(Integer id);

    Integer save(Student student);
}
