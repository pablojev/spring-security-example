package pl.pawel.loginsystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.pawel.loginsystem.entity.User;

/**
 * Created by pablojev on 04.08.2017.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByName(String name);
}
