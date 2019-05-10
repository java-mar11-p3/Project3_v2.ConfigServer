package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * 
 * @author Poho
 * This contains configuration files in a git repository 
 * that could contain location and credential of our database.
 * So that we don't have to do reconfiguration
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServer {
	public static void main(String[] args) {
		SpringApplication.run(ConfigServer.class, args);
	}
}
