package kea.datamatiker.mandatory2.Controller;

import kea.datamatiker.mandatory2.Model.Login;
import kea.datamatiker.mandatory2.Model.Teacher;
import kea.datamatiker.mandatory2.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
    public class HomeController {

    @Autowired
    private TeacherRepository teacherRepository;

        @GetMapping("/")
        public String root(
                @RequestParam(defaultValue = "NO_NAME")
                        String firstName,
                @RequestParam(defaultValue = "NO_USERNAME")
                        String lastName,
                @RequestParam(defaultValue = "NO_ROLE")
                        String role) {
            Teacher u = teacherRepository.findBylastName(lastName);
            savetoresp();
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

        /*@PostMapping("/login")
        public String adminLoggedIn(){

            return"teacher/index";
        }*/

        public void savetoresp(){
            Teacher t = new Teacher("Hans", "Hansen", "Teacher");
            teacherRepository.save(t);

        }





    }
