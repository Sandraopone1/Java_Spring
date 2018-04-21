package com.codingdojo.relationships.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.codingdojo.relationships.models.Person;
import com.codingdojo.relationships.repositories.PersonRepository;

@Service
public class PersonService {
	private PersonRepository pS;
	public PersonService(PersonRepository pS) {
		this.pS = pS;
	}
	

 	
 	public void create(Person per) {
 		pS.save(per);
	}

	  public Person find(Long id) {
		  return pS.findById(id).orElse(null);
	    }
	
	public ArrayList<Person> all(){
		return (ArrayList<Person>)pS.findAll();
	}
	
	
	public void destroy(Long id) {
		pS.deleteById(id);  
	    }
	
	public void update(Person per) {
		pS.save(per);
	}
 	


	
	
}
