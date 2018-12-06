package kea.datamatiker.mandatory2.Controller;

import kea.datamatiker.mandatory2.Model.Course;
import kea.datamatiker.mandatory2.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherAPIController {

    /*@Autowired
    private CourseRepository courseRepository;*/

    /*@PostMapping("/course/new")
    public ResponseEntity<Course> saveCourse(Course course){
        Course newCourse = courseRepository.save(course);
        return new ResponseEntity(newCourse, HttpStatus.OK);
    }*/
}
