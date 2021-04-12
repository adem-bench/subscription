package com.adidaschallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SubsUserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubsUserserviceApplication.class, args);
	}
}
