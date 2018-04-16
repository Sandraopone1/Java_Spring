package com.codingdojo.displaydate.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
    public String index() {
        return "index.jsp";
    }
	@RequestMapping("/date")
    public String date(Model model) {
		Date theDate = new java.util.Date();
		SimpleDateFormat df = new SimpleDateFormat("EEEEEE, MMMMMMM dd, yyyy");
		String dateFormat = df.format( theDate);
		model.addAttribute("date", dateFormat);
        return "date.jsp";
        
    }
	@RequestMapping("/time")
    public String time(Model model) {
		Date theTime = new java.util.Date();
		SimpleDateFormat tf = new SimpleDateFormat("HH:mm");
		String timeFormat = tf.format(theTime);
		model.addAttribute("time", timeFormat);
        return "time.jsp";
    }
}

