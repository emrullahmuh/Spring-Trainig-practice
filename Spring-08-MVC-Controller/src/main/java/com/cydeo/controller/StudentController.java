package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
  @RequestMapping("/student")
    public String studentinfo(){
        return "student/student.html";
    }
}
