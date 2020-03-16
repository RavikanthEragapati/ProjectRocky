package com.rocky.www.login.auth.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginAuthController {

	@RequestMapping(value = "/test")
	public String sayHello() {
		return "Hello";
	}

}
