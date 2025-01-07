package com.spring.app.practice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PracticeClass {

	public static void main(String[] args) {

		int i = 0;

		int val = i + 1;
		System.out.println("val: " + val + ":");

		Domain domain = new Domain();
		domain.setId("1");
		domain.setName("Rahul");
		domain.setType(null);
		
		ObjectMapper ob = new ObjectMapper();
		String json = null;
		try {
			json = ob.writeValueAsString(domain);
			System.out.println("json: " + json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
