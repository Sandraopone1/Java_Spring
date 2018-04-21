package com.codingdojo.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.relationships.models.License;
import com.codingdojo.relationships.models.Person;
import com.codingdojo.relationships.services.LicenseService;
import com.codingdojo.relationships.services.PersonService;


@Controller
@RequestMapping("/license")
public class Licenses {
	
	private LicenseService lS;
	private PersonService pS;
	private static Integer count = 0;
	
	public  Licenses ( LicenseService lS, PersonService pS) {
		this.lS = lS;
		this.pS = pS;
	}
	
	
	@RequestMapping("/new")
	public String license(Model model) {
		List<Person> persons = pS.all();
		model.addAttribute("persons", persons);
		model.addAttribute("license", new License() );
		return "license.jsp";
	}
	
	@PostMapping("/new")
	public String create(@Valid @ModelAttribute("license") License lic, BindingResult res) {
		if(res.hasErrors()) {
			return "license.jsp";
		}
		else {
			count++;
			String number = Integer.toString(count);
			lic.setNumber(number);
			lS.create(lic);
			return "redirect:/license/new";
		}
	}

}
