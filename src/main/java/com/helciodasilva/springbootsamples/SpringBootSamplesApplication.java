package com.helciodasilva.springbootsamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootSamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSamplesApplication.class, args);
	}

}

