package com.way.mscclass.dao.repository;

import com.way.mscclass.dao.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}