package com.way.mscteacher.service;

import com.way.mscteacher.dao.entity.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface TeacherService {
    List<Teacher> selectAll();

    Teacher selectByTid(String tid);

    Integer insertSelective(Teacher teacher);

    Integer updateSelectiveByTid(Teacher teacher);

    Integer deleteByTid(String tid);
}
