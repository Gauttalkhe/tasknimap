package com.example.Productdetail.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Productdetail.Entity.Entity_Prod;
import com.example.Productdetail.Service.Service_Prod;


@RestController
@RequestMapping("/api")
public class Control_Prod 
{
	@Autowired
	private Service_Prod ps;

	// Save operation
	@PostMapping("/products")
	public Entity_Prod saveProd(@Validated @RequestBody Entity_Prod product) {
		return ps.saveProd(product);
	}

	// Read operation
	@GetMapping("/products")
	public List<Entity_Prod> getAllProduct() {
		return ps.getAllProduct();
	}

	// Update operation
	@PutMapping("/products/{productId}")
	public Entity_Prod updateProd(@RequestBody Entity_Prod product, @PathVariable("productId") Integer productId) {
		return ps.updateProd(product, productId);
	}

	// Delete operation
	@DeleteMapping("/products/{productId}")
	public String delectProdById(@PathVariable("productId") Integer productId) {
		ps.delectProdById(productId);
		return "Deleted Successfully";
	}
	
	// Update operation
	@GetMapping("/products/{productId}")
		public Optional<Entity_Prod> findById(@PathVariable("productId") Integer productId) {
			return ps.findById(productId);
		}


}
