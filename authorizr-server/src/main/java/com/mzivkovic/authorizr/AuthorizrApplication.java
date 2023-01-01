package com.mzivkovic.authorizr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthorizrApplication {

	// TODO: passwords from configuration file should be environment variables
	public static void main(String[] args) {
		SpringApplication.run(AuthorizrApplication.class, args);
	}

	// TODO: github CI/CD, logging config, split into Common / Core / Server / Client projects, Audit
	// TODO: static analysis
}
