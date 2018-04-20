package com.codingdojo.languages.controllers;




import java.util.ArrayList;
import java.util.Arrays;
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

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.services.LanguageService;

@Controller
@RequestMapping("/languages")
public class Languages {
	
	private final LanguageService languageService;
	public Languages (LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@RequestMapping("")
	public String languages(Model model) {
		model.addAttribute("languages", languageService.all());
		model.addAttribute("language", new Language());
		return "languages.jsp";
	}
	
	
	@PostMapping("")
	public String create( @Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			 return "languages.jsp";
		}
//	 
		languageService.create(language);
		return "redirect:/languages";
//		}
	}
		
		@RequestMapping("{id}")
		public String findLangauge(@PathVariable("id") Long id, Model model) {
			model.addAttribute("language", languageService.findLanguageById(id) );
			return "show.jsp";
		}
	
		@RequestMapping("/delete/{id}")
		public String destroy(@PathVariable("id") Long id) {
			languageService.destroy(id);
			return "redirect:/languages";

		}
		
		@RequestMapping("/edit/{id}")
	    public String editLanguage(@PathVariable("id") Long id, Model model) {	 
			Language lang = languageService.findLanguageById(id);
			if (lang != null) {
	    	   	model.addAttribute("language",lang);
	    	   	return "edit.jsp";
			}else {
				return "redirect:/languages";
			}
		}
		
		@PostMapping("/update/{id}")
		 public String edit(@PathVariable("id") Long id, @Valid @ModelAttribute("language") Language language, BindingResult result) {
		   System.out.println("HIT EDIT POST");
			if (result.hasErrors()) {
		           return "edit.jsp";
		   }else{
			   languageService.update(language);
			   return "redirect:/languages";
		   }
	      
	    }
//	@RequestMapping("/languages")
//	public String languages(Model model) {/		List<Language> languages =languageService.;
//		model.addAttribute("languages", languages);
//		model.addAttribute("language", new Language());
//				 return "languages.jsp";
//	}
//	@PostMapping("/languages")
//    public String createLangague(@Valid @ModelAttribute("language") Language language, BindingResult result) {
//        if (result.hasErrors()) {
//            return "languages.jsp";
//        }
//        else{
//        	 languageService.addCreate(language);
//            return "redirect:/languages";
//        }
//        }
//	 @RequestMapping("/languages/{id}")
//	    public String findLangauge(Model model, @PathVariable("id") Long id) {
//		 Optional<Language> language = languageService.findLangauge(id);
//	        model.addAttribute("language",language);
//	        return "show.jsp";
//	    }
//	
//	 @RequestMapping("/languages/delete/{id}")
//		public String delete(@PathVariable("id") Language id) {
//			languageService.delete(id);
//			return "redirect:/languages";
//
//		}
// 
//
//	@RequestMapping("/languages/edit/{id}")
//    public String editLanguage(@PathVariable("id") Long id, Model model) {
//       Optional<Language> language = languageService.findLangauge(id);
//       if(language != null) {
//    	   	model.addAttribute("language", language);
//    	   	return "edit.jsp";
//       }else {
//    	   	return "redirect:/languages";
//       }
//      
//    }
//	 @PostMapping("/languages/edit/{id}")
//    public String edit(@PathVariable("id") Long id, @Valid @ModelAttribute("language") Language language, BindingResult result) {
//      
//       if (result.hasErrors()) {
//           return "edit.jsp";
//       }
//       else{
//    	   languageService.edit(id, language);
//			return "redirect:/languages";
//       }
//      
//    }
	
}


