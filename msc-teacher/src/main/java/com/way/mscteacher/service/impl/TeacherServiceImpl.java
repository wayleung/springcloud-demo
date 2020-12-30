package com.way.mscteacher.service.impl;

import com.way.mscteacher.dao.entity.Teacher;
import com.way.mscteacher.dao.repository.TeacherMapper;
import com.way.mscteacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherMapper.selectAll();
    }
}
