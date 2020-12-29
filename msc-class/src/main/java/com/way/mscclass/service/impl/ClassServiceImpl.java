package com.way.mscclass.service.impl;

import com.way.mscclass.dao.entity.Klass;
import com.way.mscclass.dao.entity.Student;
import com.way.mscclass.dao.repository.KlassRepository;
import com.way.mscclass.dao.repository.StudentRepository;
import com.way.mscclass.service.ClassService;
import com.way.mscclass.service.feign.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    KlassRepository classRepository;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentService studentService;

    @Override
    public List<Klass> getAllClasses() {
        return classRepository.findAll();
    }

    @Override
    public void addClass(Klass klass) {
        classRepository.save(klass);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addStudentFromStudent(Student student) {
        Klass klass = new Klass();
        klass.setName("class");
        addClass(klass);
        student.setClassId(klass.getId());
        studentService.addStudent(student);
//        System.out.println(1/0);
    }
}
