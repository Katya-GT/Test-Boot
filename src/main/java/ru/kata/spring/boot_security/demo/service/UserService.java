package ru.kata.spring.boot_security.demo.service;
import org.springframework.security.core.userdetails.UserDetails;
import ru.kata.spring.boot_security.demo.model.User;
import java.util.List;

public interface UserService {
    User findByUsername(String username);
    User findUserByUsername(String username);

    User findById(Long id);
    List<User> findAll();
    void save(User user);
    void deleteUserById(Long id);
}