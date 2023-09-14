package repositories;

import models.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface UserRepository extends JpaRepository<User, Long> {
    //JPARepository.
    @Override
    Optional<User> findById(Long userId);
    //find the User by the given userId.

    @Override
    List<User> findAllById(Iterable<Long> longs);
    //select * from users where user_id IN (1,2,3,4,5,6);

    Optional<User> findByEmailId(String email);

    User findByPhoneNumber(String phone);
}
