package com.microservice.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient // ANOTACION OPCIONAL QUE SERA UN CLIENTE DE EUREKA
@SpringBootApplication
public class MicroserviceStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceStudentApplication.class, args);
	}

}
