package FactorysForCar;

import IngredientsForCar.Body;
import IngredientsForCar.Engine;
import IngredientsForCar.Wheel;

public abstract class IngredientFactory {
	protected String name =null;

	public IngredientFactory(String name) {
		this.name = name;
	}
	
	public abstract Body createBody();
	public abstract Engine createEngine();
	public abstract Wheel createWheel();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[" + name + "]";
	}
	
	
}
