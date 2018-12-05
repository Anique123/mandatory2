package kea.datamatiker.mandatory2.Repository;

import kea.datamatiker.mandatory2.Model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CourseRepository extends CrudRepository<Course, Long>{
        //Course findCourse(Long id);
        List<Course> findAll();

        }



