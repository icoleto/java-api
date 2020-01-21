package com.icoleto.javaapi.service;

import java.util.List;
import java.util.Optional;

import com.icoleto.entity.User;
import com.icoleto.javaapi.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public Optional<List<User>> getUsersByName(String name) {
        return repository.findByName(name);
    }

}