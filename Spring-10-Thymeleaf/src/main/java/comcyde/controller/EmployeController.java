package comcyde.controller;

import comcyde.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeController {
   @RequestMapping("/login")
    public String login(Model model){
       model.addAttribute("employee",new Employee());
       List<String> states= Arrays.asList("Alabama","Alaska","Arizona","Arkansas","California");
       model.addAttribute("states",states);
        return "employee/employee-login";
    }
    @PostMapping("/confirm")
    public String confirm(@ModelAttribute("employee") Employee employee){

       return "employee/employee-confirm";
    }
}
