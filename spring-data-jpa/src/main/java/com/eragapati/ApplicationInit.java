package com.eragapati;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.eragapati", "com.eragapati.service", "com.eragapati.controller.rest", "com.eragapati.service.impl", "com.eragapati.config.envers"})
/**
 * 
 * @author eravi
 *
 */
public class ApplicationInit {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationInit.class, args);
	}

}
