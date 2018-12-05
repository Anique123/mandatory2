package kea.datamatiker.mandatory2.Controller;

import kea.datamatiker.mandatory2.Model.Course;
import kea.datamatiker.mandatory2.Model.Teacher;
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
    public String showCourses(Model m){
        List<Course> courses = courseRepository.findAll();
        m.addAttribute("coursesToBeSendToView", courses);
        return "teacher/index";
    }

    @GetMapping("/course/create")
    public String addCourses(Model m){
        m.addAttribute("course", new Course());
        Iterable<Teacher> teachers = teacherRepository.findAll();
        m.addAttribute("Teachers", teachers);
        return "teacher/courseNew";
    }
}
