package com.spring.app.designpatterns.singletone;

public class EarlySingletoneDesignPattern {

	private static EarlySingletoneDesignPattern e1;

	private EarlySingletoneDesignPattern() throws IllegalAccessException {
		// TODO Auto-generated constructor stub
		if (e1 != null)
			throw new IllegalAccessException("Trying to Reflex Singleton OBject");
	}

	public static EarlySingletoneDesignPattern getEarlySingletonPattern() throws IllegalAccessException {

		// this will create object when only needed.
		if (null == e1) {
			e1 = new EarlySingletoneDesignPattern();
		}

		return e1;
	}

}
