package FactorysForCar;

import IngredientsForCar.BMWEngine;
import IngredientsForCar.BMWWheel;
import IngredientsForCar.BenzBody;
import IngredientsForCar.BenzEngine;
import IngredientsForCar.BenzWheel;

public class BenzCarFactory extends CarFactory{

	public BenzCarFactory() {
		super("Benz Car Factory");
	}

	@Override
	public Car createCar(String name) {
		IngredientFactory factory = null;
		switch (name) {
		case "BENZ":
			factory = new BenzIngredientFactory();
			return new BenzCar(factory.createBody(), factory.createEngine(), factory.createWheel());
		case "BMW":
			factory = new BenzIngredientFactory();
			return new BMWCar(factory.createBody(), factory.createEngine(), factory.createWheel());
		default:
			System.out.println("nono");
			factory = new BenzIngredientFactory();
			return new BenzCar(factory.createBody(), factory.createEngine(), factory.createWheel());
		}
		
	}
}
