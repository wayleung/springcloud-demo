package com.way.mscstudent.service.impl;

import com.way.mscstudent.dao.entity.Student;
import com.way.mscstudent.dao.mapper.StudentMapper;
import com.way.mscstudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;


    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    @Override
    public Student selectBySid(String sid) {
        return studentMapper.selectBySid(sid);
    }

    @Override
    public Integer insertSelective(Student student) {
        return studentMapper.insertSelective(student);
    }

    @Override
    public Integer updateSelectiveBySid(Student student) {
        return studentMapper.updateSelectiveBySid(student);
    }

    @Override
    public Integer deleteBySid(String sid) {
        return studentMapper.deleteBySid(sid);
    }
}
