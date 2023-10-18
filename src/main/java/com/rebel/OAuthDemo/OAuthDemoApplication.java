package com.rebel.OAuthDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
public class OAuthDemoApplication
{


	public static void main(String[] args) {
		SpringApplication.run(OAuthDemoApplication.class, args);
		System.out.println("App is running !!");
	}

}
