package net.hackspace.behavioural.strategy.impl;

import net.hackspace.behavioural.strategy.ArithematicOperationStrategy;

public class MultiplicationStragegy implements ArithematicOperationStrategy {

	@Override
	public Integer performOperation(Integer num1, Integer num2) {
		return num1 * num2;
	}

}
