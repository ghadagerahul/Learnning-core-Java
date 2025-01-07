package com.spring.app.designpatterns.singletone;

public class EagerlySingletoneDesignPattern {

	private static EagerlySingletoneDesignPattern eager1 = new EagerlySingletoneDesignPattern();

	private EagerlySingletoneDesignPattern() {

	}

	public static EagerlySingletoneDesignPattern geteagerlySingtonObj() {

		return eager1;
	}
}
