package com.way.mscclass.dao.repository;

import com.way.mscclass.dao.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {

}