package com.adidaschallenge.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class SubsConfigserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubsConfigserviceApplication.class, args);
	}

}
