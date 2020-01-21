package com.icoleto.javaapi.repository;

import java.util.List;
import java.util.Optional;

import com.icoleto.entity.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    public Optional<List<User>> findByName(String name);
}