package com.cloud.client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootCloudServiceClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudServiceClient2Application.class, args);
	}

}
