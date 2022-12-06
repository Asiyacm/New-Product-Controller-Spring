package com.example.NewProduct_Backend.Controller;

import com.example.NewProduct_Backend.Model.Product;
import com.example.NewProduct_Backend.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductDao dao;
   @GetMapping("/")
    public String Homepage(){
        return "Welcome to Home page";
    }

    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String Addpage(@RequestBody Product p){
        System.out.println(p.getPname().toString());
        dao.save(p);
        return "Welcome to Product Add page";
    }

    @GetMapping("/view")
    public String Viewpage(){
        return "Welcome to Product View page";
    }
}



