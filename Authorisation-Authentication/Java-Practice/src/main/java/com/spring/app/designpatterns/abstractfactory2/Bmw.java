package com.spring.app.designpatterns.abstractfactory2;

public class Bmw implements Cars {

	@Override
	public int getmilage() {
		System.out.println("Mialge for BMW..!!!");
		return 34;
	}

	@Override
	public String getCarTyoe() {
		System.out.println("Cartype for BMW..!!!");
		return "SPORT";
	}

	@Override
	public double getCarPice() {
		System.out.println("Price for BMW...!!!");
		return 3200000;
	}

}
