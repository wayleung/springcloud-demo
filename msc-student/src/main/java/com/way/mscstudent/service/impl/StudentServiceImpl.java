package com.way.mscstudent.service.impl;

import com.way.mscstudent.dao.entity.Student;
import com.way.mscstudent.dao.repository.StudentMapper;
import com.way.mscstudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudents() {
        return studentMapper.selectAll();
    }

    @Override
    public void addStudent(Student student) {
//        System.out.println(1/0);
        studentMapper.insert(student);
    }
}
