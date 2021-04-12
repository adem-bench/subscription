package com.adidaschallenge.emailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SubsEmailserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubsEmailserviceApplication.class, args);
	}

}
