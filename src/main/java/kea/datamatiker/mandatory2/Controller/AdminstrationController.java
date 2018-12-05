package kea.datamatiker.mandatory2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminstrationController {

    @GetMapping("/adminstration/index")
    public String admin(){
        return "adminstration/index";
    }

}
