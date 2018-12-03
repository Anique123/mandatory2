package kea.datamatiker.mandatory2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @GetMapping("/student/index")
    public String student(){
        return "student/index";
    }

}
