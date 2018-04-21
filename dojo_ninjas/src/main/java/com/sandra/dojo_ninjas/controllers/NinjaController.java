package com.sandra.dojo_ninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sandra.dojo_ninjas.models.Dojo;
import com.sandra.dojo_ninjas.models.Ninja;
import com.sandra.dojo_ninjas.services.DojoService;
import com.sandra.dojo_ninjas.services.NinjaService;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {
	
	private NinjaService nS;
	private DojoService dS;
	
	public  NinjaController (NinjaService nS, DojoService dS) {
		this.nS = nS;
		this.dS = dS;
	}
	
	@RequestMapping("/new")
		public String ninja(Model model) {
			List<Dojo> dojos = dS.all();
			model.addAttribute("dojo", dojos);
			model.addAttribute("ninja", new Ninja());
			return "ninjas.jsp";
		}
	
	@PostMapping(value = "/new")
		public String creatNinja(@Valid @ModelAttribute("ninja") Ninja ninja,  Model model, BindingResult res) {
			if(res.hasErrors()) {
				return "ninjas.jsp";
			}
			else {
				nS.create(ninja);;
				return "redirect:/ninjas/new";
			}
	}
	}


