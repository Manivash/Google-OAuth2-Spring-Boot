package com.manivash.security.springbootgooglelogin;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootGoogleLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGoogleLoginApplication.class, args);
	}
	
	@RequestMapping(value="/user")
	public Principal user(Principal principal) {
		return principal;
	}

}
