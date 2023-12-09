package com.careerit.csp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class CurrencyServerAppApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(CurrencyServerAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Application started successfully");
	}
}
