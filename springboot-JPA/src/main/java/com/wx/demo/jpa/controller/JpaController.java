package com.wx.demo.jpa.controller;

import com.wx.demo.jpa.entity.Student;
import com.wx.demo.jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jpa")
public class JpaController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/findAll")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @RequestMapping("/findById")
    public Student findById(Integer id) {
        return studentService.findById(id);
    }

    @RequestMapping("/save")
    public Integer save() {
        Student student1 = new Student();
        student1.setName("jack");
        student1.setCardNum("123445545");
        return studentService.save(student1);
    }
}
