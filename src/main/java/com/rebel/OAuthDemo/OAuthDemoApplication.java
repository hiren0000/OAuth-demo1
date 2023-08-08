package com.rebel.OAuthDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class OAuthDemoApplication
{

	@GetMapping("/")
	public String message(Principal principal)
	{
		return "Hi"+principal.getName()+"Welcome to the OAuth Demo";
	}
	public static void main(String[] args) {
		SpringApplication.run(OAuthDemoApplication.class, args);
		System.out.println("App is running !!");
	}

}
