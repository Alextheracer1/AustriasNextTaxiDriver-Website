package com.alextheracer1.austriasnexttaxidriver.api;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class Controller {


  @GetMapping("/test")
  public String test() {
    return "test";
  }

}

