package com.cloud.client3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootCloudServiceClient3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudServiceClient3Application.class, args);
	}

}
