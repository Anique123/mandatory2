package kea.datamatiker.mandatory2.Repository;

import kea.datamatiker.mandatory2.Model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface CourseRepository extends CrudRepository<Course, Long>{
        Optional<Course> findById(Long id);
        List<Course> findAll();

        }



