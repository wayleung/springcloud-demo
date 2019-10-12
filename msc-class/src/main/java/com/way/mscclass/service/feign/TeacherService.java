package com.way.mscclass.service.feign;

import com.way.mscclass.service.hystrix.TeacherServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "msc-teacher",fallback = TeacherServiceHystrix.class)
public interface TeacherService {

    /**
     * 定义一个feign接口，通过@ FeignClient（“服务名”），
     * 来指定调用哪个服务。比如在代码中调用了msc-teacher服务的“/teacher/hi /teacher/student”接口
     */
    @GetMapping("/teacher/student/hi")
    String getHiFromTeacherStudent();



    @GetMapping("/teacher/student")
    List getAllStudentFromTeacherStudent();




    @GetMapping("/hi")
    String getHiFromTeacher();


    @GetMapping("/teacher")
    List getTeacherFromTeacher();
}
