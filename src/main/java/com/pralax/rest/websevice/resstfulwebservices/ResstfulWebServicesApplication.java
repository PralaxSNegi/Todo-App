package com.pralax.rest.websevice.resstfulwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class ResstfulWebServicesApplication {
	
	/*
	 * @SuppressWarnings("deprecation")
	 * 
	 * @Bean public WebMvcConfigurer configure() { return new
	 * WebMvcConfigurerAdapter() {
	 * 
	 * @Override public void addCorsMappings(CorsRegistry registry) {
	 * registry.addMapping("/**"); } }; }
	 */

	public static void main(String[] args) {
		SpringApplication.run(ResstfulWebServicesApplication.class, args);
	}

}
