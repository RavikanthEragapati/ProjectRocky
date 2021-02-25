package com.eragapati.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eragapati.entities.Products;

@Repository
public interface ProductsRepository extends CrudRepository<Products, Integer> {

}
