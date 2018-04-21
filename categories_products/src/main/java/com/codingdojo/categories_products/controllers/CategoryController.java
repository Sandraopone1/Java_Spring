package com.codingdojo.categories_products.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.categories_products.models.Category;
import com.codingdojo.categories_products.services.CategoryService;



@Controller
@RequestMapping("/categories")
public class CategoryController {
	
	private CategoryService cS;
	
	public CategoryController(CategoryService cS) {
		this.cS = cS;
	}
	
	@RequestMapping("/new")
	public String categories(Model model) {
		model.addAttribute("category",new Category() );
		return "categories.jsp";
	}
	
@PostMapping("/new")
public String create(@Valid @ModelAttribute("category") Category cat, BindingResult res) {
	if(res.hasErrors()) {
		return "categories.jsp";
	}
	 cS.create(cat);
	return "redirect:/categories/new";
}
}
