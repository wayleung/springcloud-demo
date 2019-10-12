package com.way.mscteacher.controller;

import com.way.mscteacher.config.ServerConfig;
import com.way.mscteacher.dao.entity.Student;
import com.way.mscteacher.dao.entity.Teacher;
import com.way.mscteacher.service.TeacherService;
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
    RestTemplate restTemplate;

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

    @GetMapping("/teacher/hi")
    public String getHiFromStudent(){
        return restTemplate.getForObject("http://MSC-STUDENT/hi",String.class);
    }

    @GetMapping("/teacher/student")
    public List<Student> getAllStudentFromStudent(){
        return restTemplate.getForObject("http://MSC-STUDENT/student",List.class);
    }

}
