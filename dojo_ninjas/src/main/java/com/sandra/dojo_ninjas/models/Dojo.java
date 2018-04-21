package com.sandra.dojo_ninjas.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="dojos")
public class Dojo {
	    @Id
	    @GeneratedValue
	    private Long id;
	 	private String name;
	 	
	//------------------------------------------------------------------------------------------------
	
	 	public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		//-----------------------------------------------------------------------------------------------------
		
	    @OneToMany(mappedBy="dojo", fetch = FetchType.LAZY)
	    private List<Ninja> ninjas;
	
	    public List<Ninja> getNinjas() {
			return ninjas;
		}

		public void setNinjas(List<Ninja> ninjas) {
			this.ninjas = ninjas;
		}

		//-----------------------------------------------------------------------------------------------------
		public Long getId() {
			return id;
		}
	
		public void setId(Long id) {
			this.id = id;
		}
	
		public Date getCreatedAt() {
			return createdAt;
		}
	
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
	
		public Date getUpdatedAt() {
			return updatedAt;
		}
	
		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
	
		
	    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	    private Date createdAt;
	    
	   
	    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	    private Date updatedAt;
	    
	    @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
	    
	    public Dojo() {
	    	this.createdAt = new Date ();
		this.updatedAt = new Date ();
	
	    	
	    }
}