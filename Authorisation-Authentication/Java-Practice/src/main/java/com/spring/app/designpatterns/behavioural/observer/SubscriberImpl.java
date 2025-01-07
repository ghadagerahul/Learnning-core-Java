package com.spring.app.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class SubscriberImpl implements Subscriber {

	List<ChannnelOwnerImpl> subscriber = new ArrayList<>();

	@Override
	public void Subscription(ChannnelOwnerImpl owner) {
		subscriber.add(owner);
		System.out.println("subscriber: "+subscriber.toString());
	}

	@Override
	public void unsubscription(ChannnelOwnerImpl owner) {
		subscriber.remove(owner);
		System.out.println("Unsubscriber: "+subscriber.toString());
	}

	@Override
	public void sendNotification(ChannnelOwnerImpl owner) {
	owner.sendNotification();

	}

}
