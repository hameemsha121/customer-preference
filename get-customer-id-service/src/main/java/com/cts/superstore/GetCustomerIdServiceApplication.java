package com.cts.superstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GetCustomerIdServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetCustomerIdServiceApplication.class, args);
	}

}
