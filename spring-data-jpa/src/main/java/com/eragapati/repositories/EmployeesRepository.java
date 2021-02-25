package com.eragapati.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eragapati.entities.Employees;

@Repository
public interface EmployeesRepository extends CrudRepository<Employees, Integer> {

}
