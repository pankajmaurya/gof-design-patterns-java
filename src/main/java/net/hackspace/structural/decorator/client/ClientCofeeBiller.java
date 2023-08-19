package net.hackspace.structural.decorator.client;

import net.hackspace.structural.decorator.AbstractCoffeRoot;
import net.hackspace.structural.decorator.addons.CoffeeWithChocos;
import net.hackspace.structural.decorator.addons.CoffeeWithCream;
import net.hackspace.structural.decorator.addons.WhippedCoffee;
import net.hackspace.structural.decorator.basecoffee.ColdCoffe;
import net.hackspace.structural.decorator.basecoffee.HotCoffe;

import java.util.Scanner;

public class ClientCofeeBiller {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {

			System.out.println("This is the Client Main Decorator Pattern ");

			System.out.println("What kind of coffee would you like to have ? ");
			System.out.println("Press 1 for Hot Coffee ");
			System.out.println("Press 2 for Cold Coffee ");
			Integer coffeType =   scan.nextInt();
			AbstractCoffeRoot abstractCoffeRoot =null;
			if(coffeType == 1){
				abstractCoffeRoot = new HotCoffe();
			}else{
				abstractCoffeRoot = new ColdCoffe();
			}
			
			System.out.println("Do you want Cream ? ");
			System.out.println("Press 1 for YES and 0 for NO ");
			Integer coffeCream=   scan.nextInt();
			if(coffeCream == 1){
				abstractCoffeRoot = new CoffeeWithCream(abstractCoffeRoot);
			}
			
			System.out.println("Do you want it whipped ? ");
			System.out.println("Press 1 for YES and 0 for NO ");
			if(scan.nextInt() == 1){
				abstractCoffeRoot = new WhippedCoffee(abstractCoffeRoot);
			}
			
			System.out.println("Do you want Chocos ? ");
			System.out.println("Press 1 for YES and 0 for NO ");
			if(scan.nextInt() == 1){
				abstractCoffeRoot = new CoffeeWithChocos(abstractCoffeRoot);
			}
			
			System.out.println("Your final order is");
			System.out.println(abstractCoffeRoot.getDescription());
			System.out.println("Total cost of order is " + abstractCoffeRoot.getCost());
			System.out.println("Do you want to Re-run this program - Press 1 for yes and 0 or other digits to EXIT ");
			repeatRunFlag = scan.nextInt();
		}
	}
}
