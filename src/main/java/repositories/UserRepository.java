package repositories;

import models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    //JPARepository.
    @Override
    Optional<User> findById(Long userId);
    //find the User by the given userId.

    @Override
    List<User> findAllById(Iterable<Long> longs);
    //select * from users where user_id IN (1,2,3,4,5,6);
}
