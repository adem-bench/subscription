package com.adidaschallenge.service;

import com.adidaschallenge.entity.User;

public interface UserService {

    User registerUser(User input);

    Iterable<User> findAll();
}
