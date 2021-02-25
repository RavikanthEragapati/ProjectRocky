package com.eragapati;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.eragapati.entities")
@EnableJpaRepositories("com.eragapati.repositories")
//@ComponentScan(basePackages = {"com.eragapati", "com.eragapati.service", "com.eragapati.controller.rest", "com.eragapati.service.impl", "com.eragapati.config.envers"})
/**
 * 
 * @author eravi
 *
 */
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

}
