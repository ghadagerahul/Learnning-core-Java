package com.spring.app.designpatterns.abstractfactory;

public class ClientClass {

	public static void main(String[] args) {

		Employee e1 = EmployeeFactory.getEmployeeObject(new DeveloperAbstractFactory());
		e1.name();
		e1.salary();

		Employee e2 = EmployeeFactory.getEmployeeObject(new TesterAbstractFactory());
		e2.name();
		e2.salary();
	}

}
