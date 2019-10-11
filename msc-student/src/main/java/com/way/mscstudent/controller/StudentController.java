package com.way.mscstudent.controller;

import com.way.mscstudent.config.ServerConfig;
import com.way.mscstudent.dao.entity.Student;
import com.way.mscstudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

@RestController
//@RequestMapping("/student")
public class StudentController {
//    @Value("${server.port}")
//    String port;

    @Autowired
    StudentService studentService;

    @Autowired
    ServerConfig serverConfig;

    @GetMapping("/student")
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }

//    @GetMapping("/hi")
//    public String hi() throws UnknownHostException {
//        return "hi,i am from port:"+port+" ip:"+ InetAddress.getLocalHost().getHostAddress();
//    }

    @GetMapping("/hi")
    public String hi() throws UnknownHostException {
        return "hi,i am from :"+serverConfig.getUrl();
    }
}