package kea.datamatiker.mandatory2.Controller;

import kea.datamatiker.mandatory2.Model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;


    @Controller
    public class HomeController {

        @GetMapping("/")
        public String root() {
            return "index";
        }

        @GetMapping("/student")
        public String userIndex() {
            return "student/index";
        }

        @GetMapping("/login")
        public String login() {
            return "login";
        }




    }
