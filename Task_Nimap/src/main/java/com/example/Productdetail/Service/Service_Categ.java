package com.example.Productdetail.Service;

import java.util.List;
import java.util.Optional;

import com.example.Productdetail.Entity.Entity_Categ;


public interface Service_Categ 
{
	 //save category
	
	Entity_Categ savecat(Entity_Categ category);
	
	//Get All category

	List<Entity_Categ> getAllCategory();
	
	//Update By Id
	
	Entity_Categ updateCateg(Entity_Categ category, Integer categoryId);
	
	//Delete category By Id

	void delectCategoryById(Integer categoryId);
	
	//get by Id
	
	Optional<Entity_Categ> findById(Integer categoryId);

}
