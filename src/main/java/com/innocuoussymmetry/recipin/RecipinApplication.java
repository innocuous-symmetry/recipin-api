package com.innocuoussymmetry.recipin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.innocuoussymmetry.recipin"})
@EntityScan(basePackages = {"com.innocuoussymmetry.recipin"})
public class RecipinApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipinApplication.class, args);
	}

}
