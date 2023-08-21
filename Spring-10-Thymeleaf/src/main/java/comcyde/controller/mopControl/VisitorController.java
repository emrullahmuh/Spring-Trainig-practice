package comcyde.controller.mopControl;

import comcyde.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/visitor")
public class VisitorController {

   @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("visitor", DataGenerator.createStudent());

        return "/visitor/login";
    }
}
