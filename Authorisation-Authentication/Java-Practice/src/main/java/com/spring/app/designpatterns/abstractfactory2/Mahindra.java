package com.spring.app.designpatterns.abstractfactory2;

public class Mahindra implements Cars {

	@Override
	public int getmilage() {
		System.out.println("Mialge for Mahindra..!!!");
		return 20;
	}

	@Override
	public String getCarTyoe() {
		System.out.println("Cartype for Mahindra..!!!");
		return "dashing";
	}

	@Override
	public double getCarPice() {
		System.out.println("Price for Mahindra...!!!");
		return 1500000;
	}
	
}
