package FactorysForCar;

import IngredientsForCar.BMWBody;
import IngredientsForCar.BMWEngine;
import IngredientsForCar.BMWWheel;
import IngredientsForCar.Body;
import IngredientsForCar.Engine;
import IngredientsForCar.Wheel;

public class BMWIngredientFactory  extends IngredientFactory{
	public BMWIngredientFactory() {
		super("BMW Ingredient Factory");
	}

	@Override
	public Body createBody() {
		return new BMWBody();
	}

	@Override
	public Engine createEngine() {
		return new BMWEngine();
	}

	@Override
	public Wheel createWheel() {
		return new BMWWheel();
	}
}
