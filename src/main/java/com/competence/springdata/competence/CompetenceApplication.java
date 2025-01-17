package com.competence.springdata.competence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "com.competence.springdata.competence")
public class CompetenceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CompetenceApplication.class, args);
	}

}
