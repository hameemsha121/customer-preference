package com.cts.superstore;

import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
@EnableWebSecurity
public class GetCustomerIdServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetCustomerIdServiceApplication.class, args);
	}
	
	@Bean
	public Docket SwaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.cts.superstore"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiDetails());
		
		
	}
	public ApiInfo apiDetails() {
		
		return new ApiInfo("SuperStore API",
				"sample project",
				"1.0",
				"free to use",
				new springfox.documentation.service.Contact("batch7AA",
						"abc.com", "hameemsha121@gmail.com"),
				"API license",
				"http.abc.io",
				Collections.EMPTY_LIST);
		
	}
}
