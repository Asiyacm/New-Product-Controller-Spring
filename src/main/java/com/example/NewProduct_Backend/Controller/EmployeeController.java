package com.example.NewProduct_Backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
   @GetMapping("/")
    public String Homepage(){
        return "Welcome to Home page";
    }

    @GetMapping("/add")
    public String Addpage(){
        return "Welcome to Add page";
    }

    @GetMapping("/view")
    public String Viewpage(){
        return "Welcome to View page";
    }
}



