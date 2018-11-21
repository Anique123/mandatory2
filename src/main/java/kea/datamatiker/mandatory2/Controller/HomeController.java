package kea.datamatiker.mandatory2.Controller;

import kea.datamatiker.mandatory2.Model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;


    @Controller
    public class HomeController {

        @GetMapping({"/", "index"})
        public String index() {

         return "index";
        }

        @GetMapping("teacher")
        public String teacher(){
            return "teacher";
        }

        @GetMapping("adminstration")
        public String admin(){
            return "adminstration";
        }

    }
