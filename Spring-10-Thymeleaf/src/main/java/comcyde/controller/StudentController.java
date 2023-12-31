package comcyde.controller;

import comcyde.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {


    @RequestMapping("/register")
    public String register(Model model){
model.addAttribute("students", DataGenerator.createStudent());

        return "student/register";


    }

    @RequestMapping("/drop")
    public String drop(@RequestParam String name){
        System.out.println(name);
        return "student/drop";
    }


}
