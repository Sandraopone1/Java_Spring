package com.codingdojo.relationships.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.relationships.models.License;
import com.codingdojo.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	private LicenseRepository cS;
	public LicenseService(LicenseRepository cS) {
		this.cS = cS;
	}
	
	
	public void create(License lic) {
		cS.save(lic);
	}
	
	public License find(Long id) {
		  return cS.findById(id).orElse(null);
	    }

	
	
	public ArrayList<License> all(){
		return (ArrayList<License>)  cS.findAll();
	}
	
	public void destroy(Long id) {
		cS.deleteById(id);  
	    }
	
	public void update(License lic) {
		cS.save(lic);
	}
 	

}
