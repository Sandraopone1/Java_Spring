package com.sandra.dojo_ninjas.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.sandra.dojo_ninjas.models.Dojo;
import com.sandra.dojo_ninjas.repositories.DojoRepository;


@Service
public class DojoService {
	private  DojoRepository dS;
	
 	public DojoService( DojoRepository dS) {
 		this.dS = dS;
 	}

 	public void create(Dojo dojo) {
 		dS.save(dojo);
	}

	  public Dojo find(Long id) {
		  return dS.findById(id).orElse(null);
	    }
	
	public ArrayList<Dojo> all(){
		return (ArrayList<Dojo>) dS.findAll() ;
	}
	
	
	public void destroy(Long id) {
		dS.deleteById(id);  
	    }
	
	public void update(Dojo dojo) {
		dS.save(dojo);
	}
 	
	
	
}
