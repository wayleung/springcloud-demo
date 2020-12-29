package com.way.mscclass.service;

import com.way.mscclass.dao.entity.Klass;
import com.way.mscclass.dao.entity.Student;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ClassService {
    List<Klass> getAllClasses();

    void addClass(Klass klass);

    void addStudentFromStudent(Student student);
}
