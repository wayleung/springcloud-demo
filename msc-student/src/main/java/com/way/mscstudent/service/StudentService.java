package com.way.mscstudent.service;

import com.way.mscstudent.dao.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    void addStudent(Student student);
}
