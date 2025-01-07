package com.spring.app.designpatterns.abstractfactory;

public class Tester implements Employee {

	public int salary() {
		System.out.println("salary for tester");
		return 25000;
	}

	@Override
	public String name() {
		System.out.println("name for Tester");
		return "Tester";
	}

}
