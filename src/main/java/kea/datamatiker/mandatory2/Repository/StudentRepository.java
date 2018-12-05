package kea.datamatiker.mandatory2.Repository;

import kea.datamatiker.mandatory2.Model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {
    Student findByLastName(String lastName);
    List<Student>findAll();


}
