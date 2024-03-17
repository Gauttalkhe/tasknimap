package com.example.Productdetail.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Productdetail.Entity.Entity_Categ;
import com.example.Productdetail.Repo.Repo_Categ;


@Service
public class Service_Categlm implements Service_Categ
{
	@Autowired
	private Repo_Categ cr;

	@Override
	public Entity_Categ savecat(Entity_Categ category) {
		// TODO Auto-generated method stub
		return cr.save(category);
	}

	@Override
	public List<Entity_Categ> getAllCategory() {
		// TODO Auto-generated method stub
		return (List<Entity_Categ>) cr.findAll();
	}

	@Override
	public Entity_Categ updateCateg(Entity_Categ category, Integer categoryId) {
		// TODO Auto-generated method stub
		Entity_Categ cat = cr.findById(categoryId).get();

		if (Objects.nonNull(category.getCategoryName()) && !"".equalsIgnoreCase(category.getCategoryName())) {
			cat.setCategoryName(category.getCategoryName());
		}
		return cr.save(cat);
	}

	@Override
	public void delectCategoryById(Integer categoryId) {
		// TODO Auto-generated method stub
		cr.deleteById(categoryId);
		
	}

	@Override
	public Optional<Entity_Categ> findById(Integer categoryId) {
		// TODO Auto-generated method stub
		return cr.findById(categoryId);
	}
	
}
