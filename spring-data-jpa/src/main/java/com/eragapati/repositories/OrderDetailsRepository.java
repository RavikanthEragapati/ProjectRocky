package com.eragapati.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eragapati.entities.OrderDetails;
import com.eragapati.entities.OrderDetailsId;

@Repository
public interface OrderDetailsRepository extends CrudRepository<OrderDetails, OrderDetailsId> {

}
