package com.codingdojo.hellohuman.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {	
@RequestMapping("/")
	public String index(@RequestParam(defaultValue="Human", value="name", required=false) String name) {
       return "Hello " + name;
    }
}

	

