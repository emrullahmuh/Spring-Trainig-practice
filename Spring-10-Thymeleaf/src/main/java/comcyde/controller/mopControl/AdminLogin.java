package comcyde.controller.mopControl;

import comcyde.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminLogin {

   @RequestMapping("/login")
    public String login(Model model){
       model.addAttribute("admin", DataGenerator.createStudent());
        return "/admin/login";
    }
}
