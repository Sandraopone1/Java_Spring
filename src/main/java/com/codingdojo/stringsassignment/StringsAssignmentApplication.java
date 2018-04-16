package com.codingdojo.stringsassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsAssignmentApplication.class, args);
	}
	 @RequestMapping("/")
    
     public String hello() { 
             return "Hello Client! How are you doing?";
}
	 @RequestMapping("/random")
    
     public String spring() { 
             return "Spring boot s great! So east to just respond with strings";
}
}
