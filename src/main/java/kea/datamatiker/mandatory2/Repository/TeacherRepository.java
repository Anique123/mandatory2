package kea.datamatiker.mandatory2.Repository;

import org.springframework.data.repository.CrudRepository;
import kea.datamatiker.mandatory2.Model.Teacher;



public interface TeacherRepository extends CrudRepository<Teacher, Long> {
    Teacher findBylastName(String lastName);

}
