package com.spring.app.designpatterns.abstractfactory;

public class Developer implements Employee {

	public int salary() {
		System.out.println("Salary for Developer");
		return 1000000;
	}

	@Override
	public String name() {
		System.err.println("it is developer");
		return "DEVELOPER";
	}

}
