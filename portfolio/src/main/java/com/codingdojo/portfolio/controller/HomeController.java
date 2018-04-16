package com.codingdojo.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
    public String index() {
        return "forward:/index.html";
    }
	@RequestMapping("/project")
    public String project() {
        return "forward:/project.html";
    }
	@RequestMapping("/me")
    public String me() {
        return "forward:/me.html";
    }

}
