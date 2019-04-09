package com.way.mscstudent.controller;

import com.way.mscstudent.controller.vo.CodeMsg;
import com.way.mscstudent.controller.vo.Result;
import com.way.mscstudent.dao.entity.Student;
import com.way.mscstudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;



    @Value("${server.port}")
    private String port;


    @GetMapping(value = "/hi")
    public String hi(String name){
        return "hi, I am from "+port;
    }




    @GetMapping(value = "/student")
    public Result<List<Student>> selectAll(){
        List<Student> students = studentService.selectAll();
        return new Result<>(CodeMsg.SUCCESS.getCode(),CodeMsg.SUCCESS.getMsg(),students);
    }


    @GetMapping(value = "/student/{sid}")
    public Result<Student> selectBySid(@PathVariable(value = "sid") String sid){
        Student student = studentService.selectBySid(sid);
        return new Result<>(CodeMsg.SUCCESS.getCode(),CodeMsg.SUCCESS.getMsg(),student);
    }

    @PostMapping(value = "/student")
    public Result<Integer> insertSelective(@RequestBody Student student){
        Integer integer = studentService.insertSelective(student);
        return new Result<>(CodeMsg.SUCCESS.getCode(),CodeMsg.SUCCESS.getMsg(),integer);
    }

    @PutMapping(value = "/student")
    public Result<Integer> updateSelectiveBySid(@RequestBody Student student){
        Integer integer = studentService.updateSelectiveBySid(student);
        return new Result<>(CodeMsg.SUCCESS.getCode(),CodeMsg.SUCCESS.getMsg(),integer);
    }


    @DeleteMapping(value = "/student/{sid}")
    public Result<Integer> deleteBySid(@PathVariable(value = "sid") String sid){
        Integer integer = studentService.deleteBySid(sid);
        return new Result<>(CodeMsg.SUCCESS.getCode(),CodeMsg.SUCCESS.getMsg(),integer);
    }


}
