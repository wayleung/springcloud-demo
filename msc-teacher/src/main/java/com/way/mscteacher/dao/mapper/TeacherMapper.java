package com.way.mscteacher.dao.mapper;

import com.way.mscteacher.dao.entity.Teacher;
import com.way.mscteacher.dao.provider.TeacherProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherMapper {

    @Select("SELECT * FROM teacher")
    List<Teacher> selectAll();

    @Select("SELECT * FROM teacher where tid=#{tid}")
    Teacher selectByTid(@Param(value = "tid") String tid);

    @InsertProvider(type = TeacherProvider.class,method="insertSelective")
    Integer insertSelective(Teacher teacher);

    @UpdateProvider(type = TeacherProvider.class,method = "updateSelectiveByTid")
    Integer updateSelectiveByTid(Teacher teacher);

    @Delete("DELETE * FROM teacher where tid=#{tid}")
    Integer deleteByTid(@Param(value = "tid")String tid);
}
