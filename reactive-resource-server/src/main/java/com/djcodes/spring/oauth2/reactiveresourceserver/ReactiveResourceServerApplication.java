package com.djcodes.spring.oauth2.reactiveresourceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ReactiveResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveResourceServerApplication.class, args);
	}

}
