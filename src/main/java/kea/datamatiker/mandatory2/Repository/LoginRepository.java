package kea.datamatiker.mandatory2.Repository;

import kea.datamatiker.mandatory2.Model.Login;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LoginRepository extends CrudRepository<Login, Long> {
    Login findByRole (String role);
        List<Login>findAll();
}
