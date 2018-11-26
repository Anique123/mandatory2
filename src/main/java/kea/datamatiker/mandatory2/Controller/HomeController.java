package kea.datamatiker.mandatory2.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


    @Controller
    public class HomeController {

        @GetMapping({"/", "index"})
        public String index() {
            System.out.println("Hej");
         return "index";
        }

        @GetMapping("teacher")
        public String teacher(){
            return "teacher";
        }



    }
