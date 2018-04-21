package com.sandra.dojo_ninjas.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.sandra.dojo_ninjas.models.Ninja;
import com.sandra.dojo_ninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

	private  NinjaRepository   nS ;
 	public  NinjaService( NinjaRepository nS ) {
 		this.nS = nS;
 	}

 	public void create(Ninja ninja) {
 		nS.save(ninja);
	}

	  public Ninja find(Long id) {
		  return nS.findById(id).orElse(null);
	    }
	
	public ArrayList<Ninja> all(){
		return (ArrayList<Ninja>) nS.findAll() ;
	}
	
	
	public void destroy(Long id) {
		nS.deleteById(id);  
	    }
	
	public void update(Ninja ninja) {
		nS.save(ninja);
	}
 	
}
