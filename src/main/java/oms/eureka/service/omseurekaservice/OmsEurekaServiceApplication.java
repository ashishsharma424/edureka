package oms.eureka.service.omseurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class OmsEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmsEurekaServiceApplication.class, args);
	}
}
