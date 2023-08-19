package net.hackspace.behavioural.observerpattern.observer.impl;

import net.hackspace.behavioural.observerpattern.observer.ShareBrokerObserver;

public class ShareBroker2 implements ShareBrokerObserver {

	@Override
	public void notifyCurrentPrice(Integer shareLatestPrice,
			String shareCompanyName) {
		System.out.println();
		System.out.println(this.getClass().getSimpleName() +  ": Notified $$ ");
		System.out.printf("Latest price of %S Share is %d ", shareCompanyName,shareLatestPrice);
		System.out.println();
	}
}
