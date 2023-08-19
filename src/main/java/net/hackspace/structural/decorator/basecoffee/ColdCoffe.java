package net.hackspace.structural.decorator.basecoffee;

import net.hackspace.structural.decorator.AbstractCoffeRoot;

public class ColdCoffe extends AbstractCoffeRoot {

	public ColdCoffe(){
		setName("Cold Coffee ");
		setDescription("Cold coffee with - ");
	}
	
	@Override
	public Double getCost() {
		return 12.0;
	}
}
