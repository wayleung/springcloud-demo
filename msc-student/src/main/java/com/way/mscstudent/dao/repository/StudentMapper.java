package com.way.mscstudent.dao.repository;

import com.way.mscstudent.dao.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}