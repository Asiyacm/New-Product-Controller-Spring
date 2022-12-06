package com.example.NewProduct_Backend.dao;

import com.example.NewProduct_Backend.Model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product,Integer> {
}
