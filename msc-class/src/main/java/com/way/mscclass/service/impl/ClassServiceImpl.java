package com.way.mscclass.service.impl;

import com.way.mscclass.dao.entity.Klass;
import com.way.mscclass.dao.entity.Student;
import com.way.mscclass.dao.repository.KlassMapper;
import com.way.mscclass.dao.repository.StudentMapper;
import com.way.mscclass.service.ClassService;
import com.way.mscclass.service.feign.StudentService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    KlassMapper classMapper;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    StudentService studentService;

    @Override
    public List<Klass> getAllClasses() {
        return classMapper.selectAll();
    }

    @Override
    public void addClass(Klass klass) {
        classMapper.insert(klass);
    }

    @Override
//    @Transactional(rollbackFor = Exception.class)
    @GlobalTransactional
    public void addStudentFromStudent(Student student) {
        Klass klass = new Klass();
        klass.setName("class");
        addClass(klass);
        student.setClassId(klass.getId());
        studentService.addStudent(student);
        System.out.println(1/0);
    }
}
