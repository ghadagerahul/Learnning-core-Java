package com.spring.app.designpatterns.abstractfactory2;

public class CarFactory {

	public static Cars getCarInfo(CarAbstractFactory cars) {

		return cars.getcars();
	}

}
