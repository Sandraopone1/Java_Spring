package com.codingdojo.categories_products.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.categories_products.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
