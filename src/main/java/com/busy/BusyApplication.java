package com.busy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@MapperScan("mapper")
@EnableDiscoveryClient
public class BusyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusyApplication.class, args);
	}
}
