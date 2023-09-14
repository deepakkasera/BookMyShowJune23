package services;

import models.User;
import repositories.UserRepository;

import java.util.Optional;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User login(String email, String password) {
        Optional<User> optionalUser = userRepository.findByEmailId(email);

        if (optionalUser.isEmpty()) {
            //Signup
            return signUp(email, password);
        }

        User user = optionalUser.get();

        String userPassword = user.getPassword();
        //BCryptPasswordEncoder.

        if (password.equals(userPassword)) {
            return user;
        }
        throw new RuntimeException("Wrong Password entered");
    }

    //SignUp
    private User signUp(String email, String password) {
        //Create a new user in the Database.
        return null;
    }
}
