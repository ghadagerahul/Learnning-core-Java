package com.spring.app.designpatterns.behavioural.observer;

import java.nio.channels.Channel;

public class MainClass {

	
public static void main(String[] args) {
	
	
	SubscriberImpl subsc =  new SubscriberImpl();
	
	ChannnelOwnerImpl owner = new ChannnelOwnerImpl();
	ChannnelOwnerImpl owner1 = new ChannnelOwnerImpl();
	
	subsc.Subscription(owner);
	subsc.Subscription(owner1);
	
	subsc.unsubscription(owner);
	
	subsc.sendNotification(owner);
	
}
}
