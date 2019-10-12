package com.way.mscclass.service.hystrix;

import com.way.mscclass.service.feign.TeacherService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TeacherServiceHystrix implements TeacherService {

    /**
     * 定义一个feign接口，通过@ FeignClient（“服务名”），
     * 来指定调用哪个服务。比如在代码中调用了msc-teacher服务的“/teacher/hi /teacher/student”接口
     */
    @Override
    public String getHiFromTeacherStudent() {
        return "error no data";
    }

    @Override
    public List getAllStudentFromTeacherStudent() {
        List list =new ArrayList();
        list.add("error nodata");
        return list;
    }

    @Override
    public String getHiFromTeacher() {
        return "teacher hi service down,error no data";
    }

    @Override
    public List getTeacherFromTeacher() {
        List list =new ArrayList();
        list.add("teacher get student service down,error no data");
        return list;
    }
}
