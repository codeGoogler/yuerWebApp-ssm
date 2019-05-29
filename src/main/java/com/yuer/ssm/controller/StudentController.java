package com.yuer.ssm.controller;


import com.yuer.ssm.serviceimpl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //该注解代表这个类是一个Controller
@RequestMapping("/student")  //将这个类映射一个路劲改为/student,该可以不要
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/search")
    public String searchAll(Model model){
        model.addAttribute("students",studentService.searchAll());
        return "index";
    }
}