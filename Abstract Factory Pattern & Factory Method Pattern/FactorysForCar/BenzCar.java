package FactorysForCar;

import IngredientsForCar.Body;
import IngredientsForCar.Engine;
import IngredientsForCar.Wheel;

public class BenzCar extends Car{
	
	public static final String NAME="Benz, The Car";

	public BenzCar(Body body, Engine engine, Wheel wheel) {
		super(NAME, body, engine, wheel);
	}

	@Override
	public void run() {
		System.out.println(NAME+"is running");
	}

}
