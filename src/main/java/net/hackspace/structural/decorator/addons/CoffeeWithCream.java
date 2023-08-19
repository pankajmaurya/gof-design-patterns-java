package net.hackspace.structural.decorator.addons;

import net.hackspace.structural.decorator.AbstractCoffeRoot;

public class CoffeeWithCream extends CoffeeWithAddons {

	public AbstractCoffeRoot coffee =null;
	
	public CoffeeWithCream(AbstractCoffeRoot abstractCoffeRoot){
		this.coffee = abstractCoffeRoot;
	}
	
	@Override
	public String getDescription() {
		return coffee.getDescription() + " cream " ;
	}

	@Override
	public Double getCost() {
		return coffee.getCost() + 0.15;
	}

}
