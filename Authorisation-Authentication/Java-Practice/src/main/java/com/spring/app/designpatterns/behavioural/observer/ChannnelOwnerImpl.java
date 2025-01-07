package com.spring.app.designpatterns.behavioural.observer;

public class ChannnelOwnerImpl implements ChannnelOwner {

	@Override
	public void sendNotification() {

		System.out.println("Got New Notification...!!!!!");

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	
}
