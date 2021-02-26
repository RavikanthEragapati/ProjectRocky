package com.eragapati;

import java.util.Optional;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
@EntityScan("com.eragapati.entities")
@EnableJpaRepositories("com.eragapati.repositories")
public class JpaConfiguration {

	@Bean
	public AuditorAware<String> auditorProvider() {

		/*
		 * if you are using spring security, you can get the currently logged username
		 * with following code segment.
		 * SecurityContextHolder.getContext().getAuthentication().getName()
		 */
		return () -> Optional.ofNullable("ravi");
	}

}
