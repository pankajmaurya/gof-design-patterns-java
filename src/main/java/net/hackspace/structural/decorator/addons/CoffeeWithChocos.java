package net.hackspace.structural.decorator.addons;

import net.hackspace.structural.decorator.AbstractCoffeRoot;

public class CoffeeWithChocos extends CoffeeWithAddons {

	public AbstractCoffeRoot coffee =null;
	
	public CoffeeWithChocos(AbstractCoffeRoot abstractCoffeRoot){
		this.coffee = abstractCoffeRoot;
	}
	
	@Override
	public String getDescription() {
		return coffee.getDescription() + " chocos " ;
	}

	@Override
	public Double getCost() {
		return coffee.getCost() + 0.17;
	}

}
