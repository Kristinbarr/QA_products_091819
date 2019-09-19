package com.lambdaschool.products.repositories;

// DAO -> data access object

import com.lambdaschool.products.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long>
{
}
