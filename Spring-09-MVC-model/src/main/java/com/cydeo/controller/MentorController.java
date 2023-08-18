package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {
    @RequestMapping("/mentor")
    public String mentorhomepage(Model model){
        List<Mentor>list=new ArrayList<>();
    list.add(new Mentor("mike ","smith",45, Gender.MAlE));
      list.add(new Mentor("tom","hanks",65,Gender.MAlE));
      list.add(new Mentor("ammy","bryan",25,Gender.FEMALE));
       /* Mentor men1=new Mentor("mike ","smith",45, Gender.MAlE);
        Mentor men2=new Mentor("tom","hanks",65,Gender.MAlE);
        Mentor men3=new Mentor("ammy","bryan",25,Gender.FEMALE);
*/model.addAttribute("menlist",list);


        return "mentor/mentor";
    }
}
