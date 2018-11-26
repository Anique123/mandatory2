package kea.datamatiker.mandatory2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeacherController {

    @GetMapping("/teacher/index")
    public String teacher(){
        return "teacher/index";
    }
}
