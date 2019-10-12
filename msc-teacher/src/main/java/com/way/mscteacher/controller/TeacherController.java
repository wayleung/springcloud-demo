package com.way.mscteacher.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.way.mscteacher.config.ServerConfig;
import com.way.mscteacher.dao.entity.Student;
import com.way.mscteacher.dao.entity.Teacher;
import com.way.mscteacher.service.TeacherService;
import com.way.mscteacher.service.ribbon.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.UnknownHostException;
import java.util.List;

@RestController
//@RequestMapping("/teacher")
public class TeacherController {
//    @Value("${server.port}")
//    String port;

    @Autowired
    TeacherService teacherService;

    @Autowired
    ServerConfig serverConfig;

    @Autowired
    StudentService studentService;

    @GetMapping("/teacher")
    public List<Teacher> getAllTeacher(){
        return teacherService.getAllTeachers();
    }

//    @GetMapping("/hi")
//    public String hi() throws UnknownHostException {
//        return "hi,i am from port:"+port+" ip:"+ InetAddress.getLocalHost().getHostAddress();
//    }

    @GetMapping("/hi")
    public String hi() throws UnknownHostException {
        return "hi,i am from :"+serverConfig.getUrl();
    }

    @GetMapping("/teacher/student/hi")

    public String getHiFromStudent(){
        return studentService.getHiFromStudent();
    }

    @GetMapping("/teacher/student")
    public List<Student> getAllStudentFromStudent(){
        return studentService.getAllStudentFromStudent();
    }




}
