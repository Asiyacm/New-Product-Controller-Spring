package com.example.NewProduct_Backend.Controller;

import com.example.NewProduct_Backend.Model.Product;
import com.example.NewProduct_Backend.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao dao;
    @CrossOrigin(origins = "*")
   @GetMapping("/")
    public String Homepage(){
        return "Welcome to Home page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String Addpage(@RequestBody Product p){
        System.out.println(p.getPname().toString());
        dao.save(p);
        return "Welcome to Product Add page";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Product> Viewpage(){
        return(List<Product>)dao.findAll();
    }
}



