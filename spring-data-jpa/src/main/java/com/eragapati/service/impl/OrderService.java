package com.eragapati.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eragapati.entities.Categories;
import com.eragapati.repositories.CategoriesRepository;
import com.eragapati.service.IOrdersService;

@Service
public class OrderService implements IOrdersService {

	@Autowired
	CategoriesRepository categoriesRepository;

	@Override
	public void getOrder() {
		Categories categories = new Categories();

		String str = Math.random() + "";
		categories.setCategoryName(str.substring(0, 14));
		categories.setDescription("test");
		categories.setPicture("test");

		categoriesRepository.save(categories);
	}

	@Override
	public void getOrderUpdate() {

		Optional<Categories> categories = categoriesRepository.findById(21);

		if (categories.isPresent()) {
			Categories cat = categories.get();
			cat.setDescription("updated" + Math.random());
			categoriesRepository.save(cat);
		}

	}

}
