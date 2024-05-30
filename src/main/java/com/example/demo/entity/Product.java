package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private static final List<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1L, "Arjun Product", "Arjun ke liye testing description aur thanks bolna mat bhulna"));
        products.add(new Product(2L, "Product 2", "Description for Product 2"));
    }

    private Long id;
    private String name;
    private String description;

    public Product(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static List<Product> getProducts() {
        return new ArrayList<>(products); // Return a copy to avoid modification of static data
    }
}
