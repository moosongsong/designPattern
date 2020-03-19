package FactorysForCar;

import IngredientsForCar.BenzBody;
import IngredientsForCar.BenzEngine;
import IngredientsForCar.BenzWheel;
import IngredientsForCar.Body;
import IngredientsForCar.Engine;
import IngredientsForCar.Wheel;

public class BenzIngredientFactory extends IngredientFactory{

	public BenzIngredientFactory() {
		super("Benz Ingredient Factory");
	}

	@Override
	public Body createBody() {
		return new BenzBody();
	}

	@Override
	public Engine createEngine() {
		return new BenzEngine();
	}

	@Override
	public Wheel createWheel() {
		return new BenzWheel();
	}

}
