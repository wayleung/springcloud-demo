package com.way.mscstudent.dao.mapper;

import com.way.mscstudent.dao.entity.Student;
import com.way.mscstudent.dao.provider.StudentProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {

    @Select("SELECT * FROM student")
    List<Student> selectAll();

    @Select("SELECT * FROM student where sid=#{sid}")
    Student selectBySid(@Param(value = "sid") String sid);

    @InsertProvider(type = StudentProvider.class,method="insertSelective")
    Integer insertSelective(Student student);

    @UpdateProvider(type = StudentProvider.class,method = "updateSelectiveBySid")
    Integer updateSelectiveBySid(Student student);

    @Delete("DELETE * FROM student where sid=#{sid}")
    Integer deleteBySid(@Param(value = "sid") String sid);
}
