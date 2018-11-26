package kea.datamatiker.mandatory2;


import kea.datamatiker.mandatory2.Model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Long> {
    List<Course> findAll();
}
