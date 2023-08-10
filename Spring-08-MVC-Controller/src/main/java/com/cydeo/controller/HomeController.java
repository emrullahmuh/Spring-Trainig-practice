package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
 @RequestMapping("/home")
    public String home(){
        return "home.html";
    }
    @RequestMapping("/emo")
    public String home2(){
        return "home.html";
    }
    @RequestMapping// default page
    public String home3(){
        return "home.html";
    }
    @RequestMapping({"/orenge","/apple"})
    public String home4(){
        return "home.html";
    }
    @RequestMapping({"/orenge/ap","/apple"})
    public String home5(){
        return "home.html";
    }


   /* @RequestMapping({"/student","/stu"})
    public String student(){
        return "student.html";
    }*/
}
