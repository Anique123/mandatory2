package kea.datamatiker.mandatory2.Controller;

import kea.datamatiker.mandatory2.Model.Course;
import kea.datamatiker.mandatory2.Model.Teacher;
import kea.datamatiker.mandatory2.Repository.CourseRepository;
import kea.datamatiker.mandatory2.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Controller
public class TeacherController {

    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping("/teacher/courses")
    public String showCourses(Model m){
        savetoresp();
        List<Course> courses = courseRepository.findAll();
        m.addAttribute("coursesToBeSendToView", courses);
        return "teacher/index";
    }

    @GetMapping("/course/create")
    public String addCourses(Model m){
        m.addAttribute("course", new Course());
        List<Teacher> teachers = teacherRepository.findAll();
        m.addAttribute("Teachers", teachers);
        return "teacher/courseNew";
    }

    public void savetoresp(){
        Teacher t = new Teacher("Hans", "Hansen", "Teacher");
        teacherRepository.save(t);

    }
}
