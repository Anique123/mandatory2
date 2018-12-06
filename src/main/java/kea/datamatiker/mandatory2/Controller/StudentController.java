/*package kea.datamatiker.mandatory2.Controller;

import kea.datamatiker.mandatory2.Model.Course;
import kea.datamatiker.mandatory2.Model.Student;
import kea.datamatiker.mandatory2.Repository.CourseRepository;
import kea.datamatiker.mandatory2.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentRepository studentRepository;


    @GetMapping("/courses")
    public String student(Model m){
        List<Course> courses = courseRepository.findAll();
        m.addAttribute("coursesToBeSendToView", courses);
        List<Student> students = studentRepository.findAll();
        m.addAttribute("Students", students);
        return "student/index";
    }

    @GetMapping("/student/index/{Id}")
        public String studentPage(Model m, @PathVariable("Id") Long Id){
            Student student = studentRepository.findStudentById(Id);
            List<Student> studentlist = studentRepository.findAllById(Id);
            m.addAttribute("studentlist", studentlist);
            return "";


        }



    public void savetoresp(){
        Student t = new Student("Hans", "Hansen");
        studentRepository.save(t);

    }

}*/
