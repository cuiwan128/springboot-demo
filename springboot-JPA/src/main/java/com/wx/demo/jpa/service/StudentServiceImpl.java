package com.wx.demo.jpa.service;

import com.wx.demo.jpa.dao.StudentDao;
import com.wx.demo.jpa.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student findById(Integer id) {

        //
        Optional<Student> byId = studentDao.findById(id);

        if(byId.isPresent()) {
            return byId.get();
        }
        return null;
    }

    @Override
    public Integer save(Student student) {
        //更新
        if(student.getId() != null) {
            Student student1 = studentDao.saveAndFlush(student);
            return student1.getId();
        }
        //新增
        Student save = studentDao.save(student);
        return save.getId();
    }
}
