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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import javax.transaction.Transactional;
import java.util.List;


@Controller
public class TeacherController {

    Course courseGlobal = new Course();

    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping("/teacher/index")
    public String showCourses(Model m){
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

    @PostMapping("/course/create")
    public String showNewCourseList(@ModelAttribute Course course){
        courseRepository.save(course);
        return "redirect:/teacher/index";

    }

    @GetMapping("/teacher/courseDelete/{Id}")
    public String courseDelete(Model m, @PathVariable("Id") Long Id){
        courseGlobal.setId(Id);
        return "teacher/courseDelete";
    }

   @PostMapping("/teacher/courseDelete")
   @Transactional
   public String courseDelete(){
        courseRepository.deleteById(courseGlobal.getId());
        return "redirect:/teacher/index";
   }

   @GetMapping("/teacher/courseEdit/{Id}")
   public String courseEdit(Model m, @PathVariable("Id") Long Id){
       Course course = courseRepository.findCourseById(Id);
       m.addAttribute("course", course);
       return "teacher/courseEdit";
   }

   @PostMapping("/teacher/courseEdit")
   public String courseEdit(@ModelAttribute Course course){
       courseRepository.save(course);
       teacherRepository.save(course.getTeacher());
       return "redirect:/teacher/index";
   }


    public void savetoresp(){
        Teacher t = new Teacher("Hans", "Hansen", "Teacher");
        teacherRepository.save(t);

    }
}
