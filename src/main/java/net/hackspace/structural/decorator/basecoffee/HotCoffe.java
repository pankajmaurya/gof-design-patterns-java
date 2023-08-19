package net.hackspace.structural.decorator.basecoffee;

import net.hackspace.structural.decorator.AbstractCoffeRoot;

public class HotCoffe extends AbstractCoffeRoot {

	public HotCoffe(){
		setName("Hot Coffee ");
		setDescription(" Hot coffee with - ");
	}
	
	
	@Override
	public Double getCost() {
		return 10.0;
	}

}
