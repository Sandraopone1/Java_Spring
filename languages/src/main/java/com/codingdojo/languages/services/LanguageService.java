package com.codingdojo.languages.services;

import java.util.ArrayList;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.repositories.LanguageRepository;
@Service
public class LanguageService {
	private LanguageRepository languageRepository;
	

	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	// to create a language
	public void create(Language language) {
		 languageRepository.save(language);
	}
	// to look for a language
//	public LanguageByIdd(Long id) {
//		 return languageRepository.findOne(id);
//	       }
	
	  public Language findLanguageById(Long id) {
	        return languageRepository.findById(id).orElse(null);
	    }
	// to show all language
	public ArrayList<Language> all(){
		return (ArrayList<Language>)  languageRepository.findAll() ;
	}
	
	// to delete a language
	public void destroy(Long id) {
		languageRepository.deleteById(id);;  
	    }
	
	public void update(Language language) {
		languageRepository.save(language); 
	}
	
//	private List<Language> languages = new ArrayList<Language>(Arrays.asList(
//			new Language("Java", "James Gosling", 1.8),
//			new Language("Python", "Guido van Rossum", 3.6),
//			new Language("JavaScript", "Brendon Eich", 1.89),
//			new Language("type", "Sandra Opone", 20.89)
//			));
			
//	public ArrayList<Language> allLanguages() {
//		return (ArrayList<Language>) languageRepository.findAll();
//	}
//	public void delete(Language id) {
//		languageRepository.delete(id);
//	
//	    }
//	  public Optional<Language> findLangauge(long id) {
//		  return languageRepository.findById(id);
//	    }
	 
//	 public void edit(Long id, Language language) {
//		 languageRepository.save(language);
//	    }
	
}
