package com.qpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HackersRankNewsLetterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackersRankNewsLetterServiceApplication.class, args);
		System.out.println("Runnning.................");
		
		
	}

	@Bean
	 public RestTemplate restTemplate() {
		 return new RestTemplate();
	 }
}
