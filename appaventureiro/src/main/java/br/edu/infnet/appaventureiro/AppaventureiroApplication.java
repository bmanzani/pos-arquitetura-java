package br.edu.infnet.appaventureiro;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class AppaventureiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppaventureiroApplication.class, args);
	}

}
