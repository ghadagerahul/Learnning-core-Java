package com.spring.app.designpatterns.factory;

public class ClientClass {

	public static void main(String[] args) {

		Student S1 = StudentFactory.getStudent("ARTS");
		S1.getId();
		S1.name();

		Student S2 = StudentFactory.getStudent("SCIENCE");
		S2.getId();
		S2.name();

		Student S3 = StudentFactory.getStudent("COMMERCE");
		S3.getId();
		S3.name();
	}

}
