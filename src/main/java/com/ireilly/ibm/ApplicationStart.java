package com.ireilly.ibm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages= {"com.*"})

public class ApplicationStart {
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationStart.class, args);
	}

}
