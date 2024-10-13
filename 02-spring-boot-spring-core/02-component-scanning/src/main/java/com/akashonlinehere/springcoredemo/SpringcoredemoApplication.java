package com.akashonlinehere.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// explicitly listing base packages to scan using "scanBasePackages"
//@SpringBootApplication(
//		scanBasePackages = {"com.akashonlinehere.springcoredemo",
//		                           "com.akashonlinehere.util"}
//)

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
