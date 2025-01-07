package com.spring.app.designpatterns.factory;

public class Arts implements Student {

	
	public int getId() {
		System.out.println("ID for Arts Student");
		return 11;
	}

	
	public String name() {
		System.out.println("IT IS ARTS STUDENT..!!!");
		return "ARTs";
	}

}
