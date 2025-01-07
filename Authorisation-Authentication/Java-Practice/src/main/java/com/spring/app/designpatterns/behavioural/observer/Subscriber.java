package com.spring.app.designpatterns.behavioural.observer;

public interface Subscriber {

	void Subscription( ChannnelOwnerImpl owner);
	
	void unsubscription( ChannnelOwnerImpl owner);
	
	void sendNotification( ChannnelOwnerImpl owner);
	
}
