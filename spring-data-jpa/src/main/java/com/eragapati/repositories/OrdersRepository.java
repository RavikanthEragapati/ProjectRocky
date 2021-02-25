package com.eragapati.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eragapati.entities.Orders;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Integer> {

}
