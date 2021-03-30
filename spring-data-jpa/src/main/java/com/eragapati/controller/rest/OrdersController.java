package com.eragapati.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eragapati.service.IOrdersService;

@RestController
public class OrdersController {

	@Autowired
	IOrdersService orderservice;
	@RequestMapping("/insert")
	public String insert() {
		orderservice.getOrder();
		return "Hi";
	}
	
	@RequestMapping("/update")
	public String update() {
		orderservice.getOrderUpdate();
		return "Hi";
	}

}
