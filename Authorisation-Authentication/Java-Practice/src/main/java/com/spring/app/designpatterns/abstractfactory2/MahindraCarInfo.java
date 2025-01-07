package com.spring.app.designpatterns.abstractfactory2;

public class MahindraCarInfo implements CarAbstractFactory{

	@Override
	public Cars getcars() {
		// TODO Auto-generated method stub
		return new Mahindra();
	}

}
