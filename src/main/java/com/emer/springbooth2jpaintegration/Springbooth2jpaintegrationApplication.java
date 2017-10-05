package com.emer.springbooth2jpaintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * @author Emerson Javid Gonzalez Morales
 *
 */

@Configuration
@SpringBootApplication
@EnableJpaRepositories
@EnableCaching
public class Springbooth2jpaintegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springbooth2jpaintegrationApplication.class, args);
	}
}
