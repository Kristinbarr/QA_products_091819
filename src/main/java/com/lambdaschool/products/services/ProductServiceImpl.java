package com.lambdaschool.products.services;

import com.lambdaschool.products.models.Product;
import com.lambdaschool.products.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "productService")
public class ProductServiceImpl implements ProductService
{
    @Autowired
    ProductRepository prodres;

    @Override
    public List<Product> findAll()
    {
        List<Product> myProducts = new ArrayList<>();
        prodres.findAll().iterator().forEachRemaining(myProducts::add);
        for (Product p:myProducts)
        {
            p.setPrice((p.getPrice() * 0.08) + p.getPrice());
        }
        return myProducts;
    }

    @Override
    public Product save(Product product)
    {
        product.setProdname("Zen " + product.getProdname());
        product.setPrice((product.getPrice() * 0.08) + product.getPrice());
        return prodres.save(product);
    }
}
