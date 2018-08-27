package com.project.ConfigFlightService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class ConfigFlightServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigFlightServiceApplication.class, args);
		
	}
}
