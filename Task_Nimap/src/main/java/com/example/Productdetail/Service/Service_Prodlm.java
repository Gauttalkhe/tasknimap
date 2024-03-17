package com.example.Productdetail.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Productdetail.Entity.Entity_Prod;
import com.example.Productdetail.Repo.Repo_Prod;



@Service
public class Service_Prodlm implements Service_Prod
{
   
	@Autowired
	private Repo_Prod productRepo;
	
	@Override
	public Entity_Prod saveProd(Entity_Prod product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	@Override
	public List<Entity_Prod> getAllProduct() {
		// TODO Auto-generated method stub
		return (List<Entity_Prod>) productRepo.findAll();
	}

	@Override
	public Entity_Prod updateProd(Entity_Prod product, Integer productId) {
		// TODO Auto-generated method stub
		Entity_Prod prod = productRepo.findById(productId).get();

		if (Objects.nonNull(product.getProductName()) && !"".equalsIgnoreCase(product.getProductName())) {
			prod.setProductName(product.getProductName());
		}

		if (Objects.nonNull(product.getProductPrice()) && !"".equalsIgnoreCase(product.getProductPrice())) {
			prod.setProductPrice(product.getProductPrice());
		}
		return productRepo.save(prod);
	}

	@Override
	public void delectProdById(Integer productId) {
		// TODO Auto-generated method stub
		productRepo.deleteById(productId);
	}

	@Override
	public Optional<Entity_Prod> findById(Integer productId) {
		// TODO Auto-generated method stub
		return productRepo.findById(productId);
	}

}
