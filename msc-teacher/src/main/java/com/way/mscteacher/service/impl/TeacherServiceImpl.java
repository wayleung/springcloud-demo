package com.way.mscteacher.service.impl;

import com.way.mscteacher.dao.entity.Teacher;
import com.way.mscteacher.dao.mapper.TeacherMapper;
import com.way.mscteacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherMapper teacherMapper;


    @Override
    public List<Teacher> selectAll() {
        return teacherMapper.selectAll();
    }

    @Override
    public Teacher selectByTid(String tid) {
        return teacherMapper.selectByTid(tid);
    }

    @Override
    public Integer insertSelective(Teacher teacher) {
        return teacherMapper.insertSelective(teacher);
    }

    @Override
    public Integer updateSelectiveByTid(Teacher teacher) {
        return teacherMapper.updateSelectiveByTid(teacher);
    }

    @Override
    public Integer deleteByTid(String tid) {
        return teacherMapper.deleteByTid(tid);
    }
}
