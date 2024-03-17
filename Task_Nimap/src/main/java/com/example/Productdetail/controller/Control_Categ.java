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

import com.example.Productdetail.Entity.Entity_Categ;
import com.example.Productdetail.Service.Service_Categ;


@RestController
@RequestMapping("/api")
public class Control_Categ 
{
	@Autowired
	private Service_Categ cs;
	// Save operation
			@PostMapping("/categories")
			public Entity_Categ savecat(@Validated @RequestBody Entity_Categ category) {
				return cs.savecat(category);
			}

			// Read operation
			@GetMapping("/categories")
			public List<Entity_Categ> getAllCategory() {
				return cs.getAllCategory();
			}

			// Update operation
			@PutMapping("/categories/{categoryId}")
			public Entity_Categ updateProd(@RequestBody Entity_Categ category, @PathVariable("categoryId") Integer categoryId) {
				return cs.updateCateg(category, categoryId);
			}

			// Delete operation
			@DeleteMapping("/categories/{categoryId}")
			public String delectProdById(@PathVariable("categoryId") Integer categoryId) {
				cs.delectCategoryById(categoryId);
				return "Successfully Deleted";
			}
			
			// Update operation
			@GetMapping("/categories/{categoryId}")
				public Optional<Entity_Categ> findById(@PathVariable("categoryId") Integer categoryId) {
					return cs.findById(categoryId);
				}

}
