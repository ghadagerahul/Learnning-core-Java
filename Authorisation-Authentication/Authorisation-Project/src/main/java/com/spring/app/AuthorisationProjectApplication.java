package com.spring.app;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.app.config.JwtTokenHandler;
import com.spring.app.controller.AppController;

import io.jsonwebtoken.Jwts;

@SpringBootApplication
public class AuthorisationProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorisationProjectApplication.class, args);
	}

	static {
		System.out.println("Executing static block..!!!!!");
		System.out.println("Executing static block..!!!!!");
		System.out.println("Executing static block..!!!!!");

		Map<String, Object> claims = new HashMap<>();
		new JwtTokenHandler().doGenerateToken(claims, null);
	}

	// ======= API's =======
	// http://localhost:8080/app/Login
	// http://localhost:8080/admin/getUserData
	
	//http://localhost:8080/admin/Register
	//http://localhost:8080/admin/generateToken

}
