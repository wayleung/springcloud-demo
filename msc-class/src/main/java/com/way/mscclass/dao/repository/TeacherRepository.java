package com.way.mscclass.dao.repository;

import com.way.mscclass.dao.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer>, JpaSpecificationExecutor<Teacher> {

}