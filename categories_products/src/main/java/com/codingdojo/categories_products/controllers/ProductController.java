package com.codingdojo.categories_products.controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.categories_products.models.Category;
import com.codingdojo.categories_products.models.Product;
import com.codingdojo.categories_products.services.CategoryService;
import com.codingdojo.categories_products.services.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	private ProductService pS;
	private CategoryService cS;
	
	public ProductController(ProductService pS, CategoryService cS) {
		this.pS = pS;
		this.cS = cS;
		
	}
	
	@RequestMapping("/new")
	public String product(Model model) {
		model.addAttribute("product", new Product());
			return "products.jsp";
	}
	
	@PostMapping("/new")
	public String create(@Valid @ModelAttribute("product") Product pro, BindingResult res) {
		if(res.hasErrors()) {
			return "products.jsp";
		}
		 pS.create(pro);
		return "redirect:/products/new";
	}
	
	@RequestMapping ("{id}")
	public String showProduct(@PathVariable("id") Long id, Model model) {
		model.addAttribute("categories", cS.all());
		model.addAttribute("product", pS.find(id));
		return "showProduct.jsp";
	}
				
	
	@PostMapping("{product_id}/join")
	public String join(@RequestParam("category_id") Long category_id, @PathVariable("product_id") Long product_id) {
		
	Product product = pS.find(product_id);							// product you added to
    List<Category> categories = product.getCategories();		// get all the categories that belong to the specific product
	Category category = cS.find(category_id);						// look for the category (drop down menu) that we selected
	categories.add(category);									// add selected category to specific product's list of categories
	product.setCategories(categories);							// set categories to include new selection
	
	pS.update(product);											// save

	return "redirect:/products/"+ product_id;
		
	}
	
					}
