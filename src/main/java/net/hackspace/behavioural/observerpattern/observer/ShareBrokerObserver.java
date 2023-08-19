package net.hackspace.behavioural.observerpattern.observer;

public interface ShareBrokerObserver {

	public void notifyCurrentPrice(Integer shareLatestPrice, String shareCompanyName);
	
}
