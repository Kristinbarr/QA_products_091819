package com.lambdaschool.products.services;

import com.lambdaschool.products.models.Product;

import java.util.List;

public interface ProductService
{
    List<Product> findAll();

    Product save(Product product);
}
