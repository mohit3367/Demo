package com.example.demo.service.impl;

import com.example.demo.entity.Product;
import com.example.demo.service.Productservice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements Productservice {
    @Override
    public List<Product> getProducts() {
        return Product.getProducts();
    }
}
