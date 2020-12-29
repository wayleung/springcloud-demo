package com.way.mscclass.controller;

import com.way.mscclass.config.ServerConfig;
import com.way.mscclass.dao.entity.Klass;
import com.way.mscclass.dao.entity.Student;
import com.way.mscclass.service.ClassService;
import com.way.mscclass.service.feign.StudentService;
import com.way.mscclass.service.feign.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;
import java.util.List;

@RestController
//@RequestMapping("/class")
public class ClassController {
//    @Value("${server.port}")
//    String port;

    @Autowired
    ClassService classService;

    @Autowired
    ServerConfig serverConfig;

    @Autowired
    TeacherService teacherService;

    @Autowired
    StudentService studentService;

    @GetMapping("/class")
    public List<Klass> getAllClass(){
        return classService.getAllClasses();
    }

//    @GetMapping("/hi")
//    public String hi() throws UnknownHostException {
//        return "hi,i am from port:"+port+" ip:"+ InetAddress.getLocalHost().getHostAddress();
//    }

    @GetMapping("/hi")
    public String hi() throws UnknownHostException {
        return "hi,i am from :"+serverConfig.getUrl();
    }


    @GetMapping("class/teacher/student/hi")
    public String hiFromTeacherStudent() {
        return teacherService.getHiFromTeacherStudent();
    }

    @GetMapping("class/teacher/student")
    public List studentFromTeacherStudent() {
        return teacherService.getAllStudentFromTeacherStudent();
    }

    @GetMapping("class/teacher/hi")
    public String hiFromTeacher() {
        return teacherService.getHiFromTeacher();
    }

    @GetMapping("class/teacher")
    public List getTeacherFromTeacher() {
        return teacherService.getTeacherFromTeacher();
    }



    @GetMapping("class/student")
    public List getAllStudentFromStudent() {
        return studentService.getAllStudent();
    }

    @GetMapping("class/hi")
    public String hiFromStudent() {
        return studentService.hi();
    }

    @PostMapping("class/student")
    public void addStudentFromStudent(@RequestBody Student student) {
        classService.addStudentFromStudent(student);
    }

}
