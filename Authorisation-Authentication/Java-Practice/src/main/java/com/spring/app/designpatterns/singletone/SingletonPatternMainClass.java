package com.spring.app.designpatterns.singletone;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class SingletonPatternMainClass {
	
	//https://www.youtube.com/watch?v=neSp9gap7Rw&ab_channel=LearnCodeWithDurgesh
	//https://www.youtube.com/watch?v=neSp9gap7Rw&ab_channel=LearnCodeWithDurgesh

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		// Early Creation of Object
		System.out.println("============= Early Creation : Start ================");
		EarlySingletoneDesignPattern early1 = EarlySingletoneDesignPattern.getEarlySingletonPattern();
		System.out.println(early1);

		EarlySingletoneDesignPattern early2 = EarlySingletoneDesignPattern.getEarlySingletonPattern();
		System.out.println(early2);
		System.out.println("============= Early Creation : End ================");

		// Eagerly Instaiotion of object
		EagerlySingletoneDesignPattern eager1 = EagerlySingletoneDesignPattern.geteagerlySingtonObj();
		System.err.println(eager1.hashCode());
		EagerlySingletoneDesignPattern eager2 = EagerlySingletoneDesignPattern.geteagerlySingtonObj();
		System.out.println(eager2.hashCode());
		System.out.println("==================== Eagerly Obj Creation : Start ========================");

		// Break Singleton patten using reflex API or cloning instance
		System.out.println("==================== Eagerly Obj Refletion : Start ========================");
		EarlySingletoneDesignPattern raely3 = EarlySingletoneDesignPattern.getEarlySingletonPattern();
		System.out.println(raely3.hashCode());
		Constructor<EarlySingletoneDesignPattern>[] construct = (Constructor<EarlySingletoneDesignPattern>[]) EarlySingletoneDesignPattern.class
				.getDeclaredConstructors();
		Constructor<EarlySingletoneDesignPattern> constuctor = construct[0];
		constuctor.setAccessible(true);

		EarlySingletoneDesignPattern early4 = constuctor.newInstance();
		System.out.println(early4.hashCode());
		System.out.println("==================== Eagerly Obj Refletion : Start ========================");
	}
}
