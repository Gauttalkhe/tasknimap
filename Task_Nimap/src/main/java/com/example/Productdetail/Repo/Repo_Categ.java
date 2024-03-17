package com.example.Productdetail.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Productdetail.Entity.Entity_Categ;
@Repository
public interface Repo_Categ extends JpaRepository<Entity_Categ , Integer>
{

}
