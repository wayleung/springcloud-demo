package com.way.mscteacher.service.impl;

import com.way.mscteacher.dao.entity.Student;
import com.way.mscteacher.dao.entity.Teacher;
import com.way.mscteacher.dao.repository.StudentRepository;
import com.way.mscteacher.dao.repository.TeacherRepository;
import com.way.mscteacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }
}
