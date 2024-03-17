package com.example.Productdetail.Entity;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Entity_Categ 
{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer categoryId;
	private String categoryName;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryId", referencedColumnName = "categoryId")
    List <Entity_Prod> products = new ArrayList <> ();
	
	public List<Entity_Prod > getProducts() {
		return products;
	}

	public void setProducts(List<Entity_Prod> products) {
		this.products = products;
	}

	public Integer getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "CategoryEntity [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}
	/*public CategoryEntity(String categoryName) {
		super();
		this.categoryName = categoryName;
	}*/
	
	public Entity_Categ() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entity_Categ(String categoryName, List<Entity_Prod> products) {
		super();
		this.categoryName = categoryName;
		this.products = products;
	}

	

}
