package com.example.NewProduct_Backend.Controller;

import com.example.NewProduct_Backend.Model.Product;
import com.example.NewProduct_Backend.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    @Autowired
    private ProductDao dao;

   @GetMapping("/")
    public String Homepage(){
        return "Welcome to Home page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> Addpage(@RequestBody Product p){
        System.out.println(p.getPname().toString());
        dao.save(p);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Product> Viewpage(){
        return(List<Product>)dao.findAll();
    }
}



