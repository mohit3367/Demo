package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    Productservice productservice;

    @GetMapping("/getproducts")
    public List<Product> gettingProducts(){
        return productservice.getProduct();
    }
}
