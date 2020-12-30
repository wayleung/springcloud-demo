package com.way.mscteacher.dao.repository;

import com.way.mscteacher.dao.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {

}