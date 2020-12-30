package com.way.mscteacher.dao.repository;

import com.way.mscteacher.dao.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}