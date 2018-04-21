package com.codingdojo.categories_products.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.codingdojo.categories_products.models.Category;

import com.codingdojo.categories_products.repositories.CategoryRepository;
@Service
public class CategoryService {
 private CategoryRepository  categoryRepository ;
 
 	public CategoryService(CategoryRepository categoryRepository) {
 		this.categoryRepository = categoryRepository;
 	}
 	
 	public void create(Category cat) {
 		categoryRepository.save(cat);
	}

	  public Category find(Long id) {
		  return categoryRepository.findById(id).orElse(null);
	    }
	
	public ArrayList<Category> all(){
		return (ArrayList<Category>)categoryRepository.findAll() ;
	}
	
	
	public void destroy(Long id) {
		categoryRepository.deleteById(id);  
	    }
	
	public void update(Category cat) {
		categoryRepository.save(cat);
	}
}
