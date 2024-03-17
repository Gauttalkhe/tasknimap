package com.example.Productdetail.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Productdetail.Entity.Entity_Prod;


@Repository
public interface Repo_Prod extends JpaRepository<Entity_Prod , Integer>
{

}
