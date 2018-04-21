package com.codingdojo.relationships.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.codingdojo.relationships.models.Person;
import com.codingdojo.relationships.services.PersonService;


@Controller
@RequestMapping("/persons")
public class Persons {
	
	private PersonService pS;
	
	public Persons( PersonService pS) {
		this.pS = pS;
		
	}
	
	@RequestMapping("/new")
	public String person(Model model) {
		model.addAttribute("person", new Person() );
		return "persons.jsp";
	}
	
	@PostMapping("/new")
	public String create(@Valid @ModelAttribute("person") Person per, BindingResult res) {
		if(res.hasErrors()) {
			return "persons.jsp";
		}
		 pS.create(per);
		return "redirect:/persons/new";
	}
	
	@RequestMapping("/{id}")
	public String showPerson(@PathVariable("id") Long id, Model model) {
		model.addAttribute("person", pS.find(id));
		return "showPerson.jsp";
		}
	
	

	}

