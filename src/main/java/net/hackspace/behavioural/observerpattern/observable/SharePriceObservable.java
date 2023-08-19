package net.hackspace.behavioural.observerpattern.observable;

import net.hackspace.behavioural.observerpattern.observer.ShareBrokerObserver;

import java.util.ArrayList;

public interface SharePriceObservable {

//	public ArrayList<ShareBrokerObserver> shareBrokers = new ArrayList<ShareBrokerObserver>();
	
	public void addObserver(ShareBrokerObserver shareBrokerObserver);
	
	public void removeObserver(ShareBrokerObserver shareBrokerObserver);
	
	public void notifyObservers();
	
	// This is just a work around to simulate the price from client side 
	public void setCurrentMarketPrice(Integer currentMarketPrice);
}
