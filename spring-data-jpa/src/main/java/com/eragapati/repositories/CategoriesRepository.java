package com.eragapati.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eragapati.entities.Categories;

@Repository
public interface CategoriesRepository extends CrudRepository<Categories, Integer> {

}
