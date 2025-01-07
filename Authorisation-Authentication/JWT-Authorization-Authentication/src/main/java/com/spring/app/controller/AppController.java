package com.spring.app.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/app/Register")
	public String returnTokenDataOnStart() {

		return "Sucess";
	}
	
	
	public static void main(String[] args) {
		
		StringBuilder finalDmiResponseString = new StringBuilder();
		
		finalDmiResponseString.append("werfg");
		
		int lenght = finalDmiResponseString.length() + 17;
		
		System.out.println("lenght: "+lenght);
	}
}
