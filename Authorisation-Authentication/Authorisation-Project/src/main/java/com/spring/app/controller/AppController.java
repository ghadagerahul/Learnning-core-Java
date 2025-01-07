package com.spring.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.config.JwtTokenHandler;
import com.spring.app.model.UserEnrollDetails;

@RestController
@RequestMapping("/app")
public class AppController {

	@Autowired
	private JwtTokenHandler tokenHandler;

	@GetMapping("/Login")
	public Authentication showUserDetails() {

		System.out.println("Wohhh...You are logged in..!!!!!!");
		Authentication user = SecurityContextHolder.getContext().getAuthentication();
		SecurityContextHolder.getContext().setAuthentication(null);
		return user;

	}

	public String generatetocken() {
		Map<String, Object> claims = new HashMap<>();
		String token = tokenHandler.doGenerateToken(claims, "rahul");
		return token;
	}

}
