package com.sandra.dojo_ninjas.controllers;





import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sandra.dojo_ninjas.models.Dojo;
import com.sandra.dojo_ninjas.models.Ninja;
import com.sandra.dojo_ninjas.services.DojoService;
import com.sandra.dojo_ninjas.services.NinjaService;

@Controller
@RequestMapping("/dojo")
public class DojoController {
	
private DojoService dS;
	
	public  DojoController (DojoService dS) {
		this.dS = dS;
	}
	
	@RequestMapping("/new")
		public String dojo(Model model) {
			model.addAttribute("dojo", new Dojo());
			return "dojo.jsp";
		}
	@RequestMapping("")
	public String allDojos(Model model) {
		List<Dojo> dojos = dS.all();
		model.addAttribute("dojos", dojos);
		return "allDojo.jsp";
	}
	
	@PostMapping("/new")
		public String creatDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult res) {
			if(res.hasErrors()) {
				return "dojo.jsp";
			}
			else {
				dS.create(dojo);
				return "redirect:/dojo/new";
			}
	}
	@RequestMapping("/{id}")
	public String showPerson(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", dS.find(id));
		return "individualDojoInfo.jsp";
		}
	
		

}
