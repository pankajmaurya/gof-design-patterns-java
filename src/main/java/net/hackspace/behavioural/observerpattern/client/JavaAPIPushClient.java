package net.hackspace.behavioural.observerpattern.client;

import net.hackspace.behavioural.observerpattern.javaapi.push.observable.ShareBrokerObservable;
import net.hackspace.behavioural.observerpattern.javaapi.push.observable.ShareSubject1;
import net.hackspace.behavioural.observerpattern.observable.SharePriceObservable;

import java.util.Random;
import java.util.Scanner;

public class JavaAPIPushClient {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {

			System.out
					.println("This is the Client Main file for Observer Pattern where user can attach and detech subject on runtime without hard coded data");
			System.out
					.println("User is acting as a borker here and he can choose to turn on notification from 2 different companies");
			ShareSubject1 subject1 = new ShareSubject1();
			ShareBrokerObservable subscriber1 = new ShareBrokerObservable();
			subject1.addObserver(subscriber1);
			
			subject1.setInitialPrice(10);
subject1.setFinalCalculatedPrice(9999);
			System.out
					.println("Do you want to Re-run this program - Press 1 for yes and 0 or other digits to EXIT ");
			repeatRunFlag = scan.nextInt();
		}
	}

	public static void simulateSharePriceChange(
			SharePriceObservable sharePriceObservable) {
		Random rnd = new Random();
		for (int i = 0; i < 2; i++) {
			sharePriceObservable.setCurrentMarketPrice(rnd.nextInt());
		}
	}
}
