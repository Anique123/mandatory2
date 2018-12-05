package kea.datamatiker.mandatory2.Controller;

import kea.datamatiker.mandatory2.Model.Course;
import kea.datamatiker.mandatory2.Repository.CourseRepository;
import kea.datamatiker.mandatory2.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TeacherController {

    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping("/teacher/courses")
    public String teacher(Model m){
        List<Course> courses = courseRepository.findAll();
        m.addAttribute("coursesToBeSendToView", courses);
        return "teacher/index";
    }
}
