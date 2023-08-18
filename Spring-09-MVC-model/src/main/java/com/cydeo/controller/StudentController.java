package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.boot.Banner;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

@Controller
public class StudentController {
    @RequestMapping("/tamer")
    public String homepage(Model model){
       //String name="abd";
model.addAttribute("name","cydeo");
model.addAttribute("course","mvc");
String subject="spring boot";
model.addAttribute("subject",subject);
int studentid=new Random().nextInt();
model.addAttribute("id",studentid);
List<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
    model.addAttribute("numbers",numbers);
        LocalDate today=LocalDate.now();
        model.addAttribute("day",today);
       LocalDateTime time= LocalDateTime.now(ZoneId.systemDefault());
model.addAttribute("time",time);
        Student student1=new Student(12,"AHMET","NEJAT");
      model.addAttribute("student1",student1);
        return"student/welcome.html";
    }
}
