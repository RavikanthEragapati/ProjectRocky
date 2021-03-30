package com.eragapati.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eragapati.entities.Categories;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Integer> {

	public List<Categories> findByDescription(String description);

	@Query("Select f from Categories f where f.description = :name")
	public List<Categories> findByQuery(@Param("name") String name);

}
