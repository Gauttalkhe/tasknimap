package com.example.Productdetail.Service;

import java.util.List;
import java.util.Optional;

import com.example.Productdetail.Entity.Entity_Prod;



public interface Service_Prod 
{
	//save Product
	
	Entity_Prod saveProd(Entity_Prod product);
		
		//Get All Product

		List<Entity_Prod> getAllProduct();
		
		//Update By Id
		
		Entity_Prod updateProd(Entity_Prod product, Integer productId);
		
		//Delete Product By Id

		void delectProdById(Integer productId);
		
		//get by Id
		
		Optional<Entity_Prod> findById(Integer productId);

}
