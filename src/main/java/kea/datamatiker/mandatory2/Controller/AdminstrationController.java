package kea.datamatiker.mandatory2.Controller;

import kea.datamatiker.mandatory2.Model.Student;
import kea.datamatiker.mandatory2.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminstrationController {

    @Autowired
    private StudentRepository studentRepo;

    @GetMapping("/adminstration")
    public String StudentsList(Model m){
        List<Student> students = studentRepo.findAll();
        System.out.println(students);

        m.addAttribute("studentsToBeSentToView", students);

        return "/adminstration/index";
    }

}
