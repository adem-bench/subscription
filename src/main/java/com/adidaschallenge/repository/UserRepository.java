package com.adidaschallenge.repository;

import com.adidaschallenge.entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {

}