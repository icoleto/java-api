package com.icoleto.javaapi.controller;

import java.util.List;
import java.util.Optional;

import com.icoleto.entity.User;
import com.icoleto.javaapi.dto.FibonacciDto;
import com.icoleto.javaapi.service.Functions;
import com.icoleto.javaapi.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

  @Autowired
  private Functions functions;
  @Autowired
  private UserService userService;

  @GetMapping("/")
  public String HelloWorld() {
    return "Hello Java World!";
  }

  @GetMapping("fibonacci/{num}")
  public FibonacciDto Fibonacci(@PathVariable final Long num) {
    return new FibonacciDto(num,functions.fibonacci(num));
  }

  @GetMapping("user")
  public Optional<List<User>> getUsers(@RequestParam("name") final String name) {
    return userService.getUsersByName(name);
  }
}
