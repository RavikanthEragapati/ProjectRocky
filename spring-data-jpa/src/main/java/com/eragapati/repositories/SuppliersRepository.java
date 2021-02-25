package com.eragapati.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eragapati.entities.Suppliers;

@Repository
public interface SuppliersRepository extends CrudRepository<Suppliers, Integer> {

}
