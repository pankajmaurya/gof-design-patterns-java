package net.hackspace.behavioural.visitor;

import java.util.Scanner;

public class ClientFile {

	public static void main(String[] args) {

		System.out.println("Welcome to Party host example which  uses visitor pattern ");
		Scanner scan = new Scanner(System.in);
		PartyHost partyHost;
		CookVisitorI visitorCook;
		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {
			System.out.println("Which party do you want to host ");
			System.out.println("press 1 for Week end party ");
			System.out.println("press 2 for Week day party ");
			int tvType = scan.nextInt();
			if (tvType == 1) {
				partyHost = new WeekEndParyHost();
			} else {
				partyHost = new WeekDayParyHost();
			}

			System.out.println("How would you want to manage cooking of food  ");
			System.out.println(" Press 1 for a visitor Veg Cook ");
			System.out.println(" Press 2 for a visitor Non- Veg Cook  ");
			System.out.println(" Press 3 for in house cooking (no visitor) ");

			int type = scan.nextInt();
			try {
				switch (type) {
				case 1:
					visitorCook = new VegCookVisitor();
					partyHost.accept(visitorCook);
					break;
				case 2:
					visitorCook = new NonVegCookVisitor();
					partyHost.accept(visitorCook);
					break;
				case 3:
					partyHost.cookInHouse();
					break;

				}
				
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			System.out.println("=============================");
			System.out.println("Press 1 to Repeat .... ");
			try {
				repeatRunFlag = scan.nextInt();
			} catch (Exception e) {
				repeatRunFlag = 0;
			}

		}

		System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
		System.out.println("\n $$$$$$$$$$$$$$$$$$$$$  www.premaseem.com  $$$$$$$$$$$$$$$$$$$$$$ \n ");	

	}
}
