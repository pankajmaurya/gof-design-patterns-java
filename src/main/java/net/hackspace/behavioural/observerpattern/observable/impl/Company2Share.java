package net.hackspace.behavioural.observerpattern.observable.impl;

import net.hackspace.behavioural.observerpattern.observable.SharePriceObservable;
import net.hackspace.behavioural.observerpattern.observer.ShareBrokerObserver;

import java.util.ArrayList;

public class Company2Share implements SharePriceObservable {

	public ArrayList<ShareBrokerObserver> shareBrokers = new ArrayList<ShareBrokerObserver>();
	private Integer currentMarketPrice=0;
	
	@Override
	public void addObserver(ShareBrokerObserver shareBrokerObserver) {
		shareBrokers.add(shareBrokerObserver);
		
	}

	@Override
	public void removeObserver(ShareBrokerObserver shareBrokerObserver) {
		shareBrokers.remove(shareBrokerObserver);
		
	}

	@Override
	public void notifyObservers() {
	for(ShareBrokerObserver shareBroker :shareBrokers){
		shareBroker.notifyCurrentPrice(getCurrentMarketPrice()," @AccionLabs# ");
	} 
		
	}

	public Integer getCurrentMarketPrice() {
		return currentMarketPrice;
	}

	public void setCurrentMarketPrice(Integer currentMarketPrice) {
		this.currentMarketPrice = currentMarketPrice;
		notifyObservers();
	}

	
}
