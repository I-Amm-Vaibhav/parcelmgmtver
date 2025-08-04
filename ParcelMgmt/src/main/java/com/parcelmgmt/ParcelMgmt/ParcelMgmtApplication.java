package com.parcelmgmt.ParcelMgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity
public class ParcelMgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParcelMgmtApplication.class, args);
	}

}
