package com.way.mscteacher.service.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.way.mscteacher.dao.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiStudentError")
    public String getHiFromStudent(){
        return restTemplate.getForObject("http://MSC-STUDENT/hi",String.class);
    }


    @HystrixCommand(fallbackMethod = "studentStudentError")
    public List<Student> getAllStudentFromStudent(){
        return restTemplate.getForObject("http://MSC-STUDENT/student",List.class);
    }


    /**
     * hystrix fallback method 返回类型要与上面方法类型对应
     * @return
     */
    public String hiStudentError(){
        return "student's hi service error";
    }

    public List<Student> studentStudentError(){
        List list = new ArrayList();
        String s = "student's student service error";
        list.add(s);
        return list;
    }
}
