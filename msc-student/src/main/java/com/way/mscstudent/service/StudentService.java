package com.way.mscstudent.service;

import com.way.mscstudent.dao.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface StudentService {
    List<Student> selectAll();

    Student selectBySid(String sid);

    Integer insertSelective(Student student);

    Integer updateSelectiveBySid(Student student);

    Integer deleteBySid(String sid);
}
