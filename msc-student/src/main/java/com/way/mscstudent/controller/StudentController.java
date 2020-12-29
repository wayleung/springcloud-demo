package com.way.mscstudent.controller;

import com.way.mscstudent.config.ServerConfig;
import com.way.mscstudent.dao.entity.Student;
import com.way.mscstudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

@RestController
//需要更新的服务代码页要加上这个注解 不是加在启动类！！
@RefreshScope
//@RequestMapping("/student")
public class StudentController {
//    @Value("${server.port}")
//    String port;

    @Autowired
    StudentService studentService;

    @Autowired
    ServerConfig serverConfig;

//    @Value("${myconfig}")
//    String myconfig;

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

//    @GetMapping("/myconfig")
//    public String getMyConfig(){
//        return myconfig;
//    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
}
