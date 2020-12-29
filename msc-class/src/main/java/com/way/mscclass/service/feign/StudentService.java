package com.way.mscclass.service.feign;

import com.way.mscclass.dao.entity.Student;
import com.way.mscclass.service.hystrix.TeacherServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

/**
 * @author wayleung
 * @description
 * @date 2020-12-29 11:57:36
 */
@FeignClient(value = "msc-student")
public interface StudentService {
    @GetMapping("/student")
    List<Student> getAllStudent();

    @GetMapping("/hi")
    String hi();

    @PostMapping("/student")
    void addStudent(@RequestBody Student student);
}
