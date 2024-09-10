package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findByEmail(String email);
    User findById(Long id);

    void saveUser(User user);

    void deleteById(Long id);





}