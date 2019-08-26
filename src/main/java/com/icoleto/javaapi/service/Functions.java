package com.icoleto.javaapi.service;

import org.springframework.stereotype.Service;

@Service
public class Functions {

  public Long fibonacci(Long num) {
    return num <= 1 ? num : fibonacci(num - 1) + fibonacci(num - 2);
  }
}
