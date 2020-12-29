package com.way.mscclass.service.hystrix;

import com.way.mscclass.dao.entity.Student;
import com.way.mscclass.service.feign.StudentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wayleung
 * @description
 * @date 2020-12-29 17:13:08
 */

@Component
@Log4j2
public class StudentServiceHystrix implements StudentService {
    @Override
    public List<Student> getAllStudent() {
        log.error("getAllStudent error");
        return null;
    }

    @Override
    public String hi() {
        log.error("hi error");
        return null;
    }

    @Override
    public void addStudent(Student student) {
        log.error("addStudent error");
    }
}
