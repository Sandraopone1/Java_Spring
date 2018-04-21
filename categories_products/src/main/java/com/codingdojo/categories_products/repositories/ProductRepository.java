package com.codingdojo.categories_products.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.categories_products.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
