package net.hackspace.behavioural.chainOfResponsibility.signedNumber;

import java.util.Scanner;

public class ClientFile {

	public static void main(String[] args) {

		System.out.println("Welcome to Number identifier program designed using Chain of Responsibility ");
		Scanner scan = new Scanner(System.in);
		
		NumberChain positiveNumberHandler = new PositiveNumberHandler();
		NumberChain negativeNumberHandler = new NegativeNumberHandler();
		NumberChain neutralNumberHandler = new ZeroNumberHandler();
		
		// Setting up the change
		positiveNumberHandler.setNextHandler(negativeNumberHandler);
		negativeNumberHandler.setNextHandler(neutralNumberHandler);

		String repeatRunFlag = "y";
		while (!repeatRunFlag.equalsIgnoreCase("no")) {
			System.out.println("Please enter any number 0, less then or greater then zero eg. -22 or 89 ? ");
			int choice = scan.nextInt();
			positiveNumberHandler.handler(choice);

			System.out.println("=============================");

			System.out.println("Press No to Exit and any other character to repeat ....  ");
			try {
				repeatRunFlag = scan.next();
			} catch (Exception e) {
				repeatRunFlag = "n";
			}
		}

		System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
		System.out.println("\n $$$$$$$$$$$$$$$$$$$$$  www.premaseem.com  $$$$$$$$$$$$$$$$$$$$$$ \n ");	

	}
}
