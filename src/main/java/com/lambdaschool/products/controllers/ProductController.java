package com.lambdaschool.products.controllers;

import com.lambdaschool.products.models.Product;
import com.lambdaschool.products.repositories.ProductRepository;
import com.lambdaschool.products.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController
{
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/products/products",
                produces = {"application/json"})
    public ResponseEntity<?> listAllProducts()
    {
        // body, headers, status
        List<Product> myProducts = productService.findAll();
        return new ResponseEntity<>(myProducts, null, HttpStatus.OK);
    }
}
