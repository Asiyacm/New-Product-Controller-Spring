package com.example.NewProduct_Backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
   @GetMapping("/")
    public String Homepage(){
        return "Welcome to Home page";
    }
}



