package com.eragapati.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eragapati.entities.Shippers;

@Repository
public interface ShippersRepository extends CrudRepository<Shippers, Integer> {

}
