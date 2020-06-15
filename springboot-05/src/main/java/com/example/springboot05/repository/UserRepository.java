package com.example.springboot05.repository;

import com.example.springboot05.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    Iterable<User> findByName(String name);
}
