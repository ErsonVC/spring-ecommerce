package com.proyecto.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringEcommerce1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringEcommerce1Application.class, args);
	}

}
