package com.codingdojo.categories_products.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.codingdojo.categories_products.models.Product;

import com.codingdojo.categories_products.repositories.ProductRepository;


@Service
public class ProductService {
	
	private ProductRepository  productRepository ;
 	public ProductService(ProductRepository productRepository ) {
 		this.productRepository = productRepository;
 	}

 	public void create(Product pro) {
 		productRepository.save(pro);
	}

	  public Product find(Long id) {
		  return productRepository.findById(id).orElse(null);
	    }
	
	public ArrayList<Product> all(){
		return (ArrayList<Product>) productRepository.findAll() ;
	}
	
	
	public void destroy(Long id) {
		productRepository.deleteById(id);  
	    }
	
	public void update(Product pro) {
		productRepository.save(pro);
	}
 	
 	

}
