package com.codingdojo.categories_products.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Category {
		@Id
	    @GeneratedValue
	    private Long id;
		
		@Size(min=1, max=255, message="Name cannot be blank")
		private String name;
		
		// ----------------------------------------------------------------------------------------------
		
		
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		
		// ----------------------------------------------------------------------------------------------
		
		 @ManyToMany(fetch = FetchType.LAZY)
		    @JoinTable(
		        name = "categories_products", 
		    	        joinColumns=@JoinColumn(name="product_id"),
		    	        inverseJoinColumns=@JoinColumn(name="category_id")
		    )
		 private List<Product> products;
		
		
		public List<Product> getProducts() {
			return products;
		}

		public void setProducts(List<Product> products) {
			this.products = products;
		}

				
		// ------------------------------------------------------------------------------------------
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
			    
			    public Category() {
			    	this.createdAt = new Date ();
				this.updatedAt = new Date ();

			    	
			    }
}
