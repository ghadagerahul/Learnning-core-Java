package com.spring.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.app.config.JwtTokenHandler;
import com.spring.app.model.UserEnrollDetails;
import com.spring.app.repo.AbstractRepo;
import com.spring.app.repoimpl.AbstractRepoImpl;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private JwtTokenHandler tokenHandler;

	@Autowired
	private AbstractRepo repoImpl;

	@PostMapping("/Register")
	public String registerUser(@RequestBody String request) {

		String returnValue = "";
		ObjectMapper ob = new ObjectMapper();
		try {
			UserEnrollDetails user = ob.readValue(request, UserEnrollDetails.class);
			System.out.println("user: " + user);
			UserEnrollDetails status = repoImpl.save(user);

			if (null != status)
				returnValue = "User has been created Successfilly: " + "..!!!";
			else
				returnValue = "User Creation Failsed..!!!";

		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return returnValue;
	}

	@GetMapping("/generateToken")
	public String loginAndGetToken(@RequestBody String username) {

		String token = tokenHandler.doGenerateToken(new HashMap<>(), username);
		System.out.println("username: " + username);
		System.out.println("token: " + token);
		return "username: "+username+" :: "+"token: "+token;

	}

	@GetMapping("/getUserData")
	public Map<List<UserEnrollDetails>, String> showUserDetails() {

		Map<String, Object> claims = new HashMap<>();
		List<UserEnrollDetails> list = new ArrayList<>();

//		list.add(new UserDetails(1, "Rahul", "223334454", "pune"));
//		list.add(new UserDetails(2, "Prashant", "2345654344", "neware"));
//		list.add(new UserDetails(3, "Rajendra", "3344554433", "shreepur"));

		String token = tokenHandler.doGenerateToken(claims, "rahul");
		Map<List<UserEnrollDetails>, String> list1 = new HashMap<>();
		list1.put(list, token);
		return list1;

	}

	public String generatetocken() {
		Map<String, Object> claims = new HashMap<>();
		String token = tokenHandler.doGenerateToken(claims, "rahul");
		return token;
	}

}
