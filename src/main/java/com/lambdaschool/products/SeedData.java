package com.lambdaschool.products;

import com.lambdaschool.products.models.Product;
import com.lambdaschool.products.repositories.ProductRepository;
import com.lambdaschool.products.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Component
public class SeedData implements CommandLineRunner
{
    @Autowired
    ProductService productService;

    @Override
    public void run(String... args) throws Exception
    {
        Product prod1 = new Product();
        prod1.setProdname("Lambda Shirt");
        prod1.setPrice(10.00);
        productService.save(prod1);
    }
}
