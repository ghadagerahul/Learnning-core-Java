package com.spring.app.designpatterns.abstractfactory;

public class TesterAbstractFactory extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployeeObject() {

		return new Tester();
	}

}
