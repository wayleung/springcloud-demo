package com.way.mscteacher.controller;

import com.way.mscteacher.controller.vo.CodeMsg;
import com.way.mscteacher.controller.vo.Result;
import com.way.mscteacher.dao.entity.Teacher;
import com.way.mscteacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    TeacherService teacherService;



    @GetMapping(value = "/teacher")
    public Result<List<Teacher>> selectAll(){
        List<Teacher> teachers = teacherService.selectAll();
        return new Result<>(CodeMsg.SUCCESS.getCode(),CodeMsg.SUCCESS.getMsg(),teachers);
    }


    @GetMapping(value = "/teacher/{tid}")
    public Result<Teacher> selectByTid(@PathVariable(value = "tid") String tid){
        Teacher teacher = teacherService.selectByTid(tid);
        return new Result<>(CodeMsg.SUCCESS.getCode(),CodeMsg.SUCCESS.getMsg(),teacher);
    }

    @PostMapping(value = "/teacher")
    public Result<Integer> insertSelective(@RequestBody Teacher teacher){
        Integer integer = teacherService.insertSelective(teacher);
        return new Result<>(CodeMsg.SUCCESS.getCode(),CodeMsg.SUCCESS.getMsg(),integer);
    }

    @PutMapping(value = "/teacher")
    public Result<Integer> updateSelectiveByTid(@RequestBody Teacher teacher){
        Integer integer = teacherService.updateSelectiveByTid(teacher);
        return new Result<>(CodeMsg.SUCCESS.getCode(),CodeMsg.SUCCESS.getMsg(),integer);
    }


    @DeleteMapping(value = "/teacher/{tid}")
    public Result<Integer> deleteByTid(@PathVariable(value = "tid") String tid){
        Integer integer = teacherService.deleteByTid(tid);
        return new Result<>(CodeMsg.SUCCESS.getCode(),CodeMsg.SUCCESS.getMsg(),integer);
    }


}
