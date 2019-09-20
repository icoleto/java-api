package com.icoleto.javaapi.controller;

import com.icoleto.javaapi.dto.FibonacciDto;
import com.icoleto.javaapi.service.Functions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

  @Autowired
  private Functions functions;

  @GetMapping("/")
  public String HelloWorld() {
    return "Hello Java World!";
  }

  @GetMapping("fibonacci/{num}")
  public FibonacciDto Fibonacci(@PathVariable Long num) {
    return new FibonacciDto(num,functions.fibonacci(num));
  }
}
