package com.partOne.PartOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.partOne.PartOne.service.UserServiceImpl;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PartOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartOneApplication.class, args);
	}
}
