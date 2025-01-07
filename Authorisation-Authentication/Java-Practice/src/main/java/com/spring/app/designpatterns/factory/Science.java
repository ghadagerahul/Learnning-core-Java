package com.spring.app.designpatterns.factory;

public class Science implements Student {

	public int getId() {
		System.out.println("ID FOR SCIENCE STUDENT ..!!!");
		return 12;
	}

	public String name() {
		System.out.println("IT IS SCIENCE STUDENT..!!!!");
		return "SCIENCE";
	}

}
