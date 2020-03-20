package FactorysForCar;

import IngredientsForCar.BMWBody;
import IngredientsForCar.BMWEngine;
import IngredientsForCar.BMWWheel;

public class BMWCarFactory  extends CarFactory{

	public BMWCarFactory() {
		super("BMW Car Factory");
	}
	
	@Override
	public Car createCar(String name) {
		return new BMWCar(new BMWBody(), new BMWEngine(), new BMWWheel());
	}
}
