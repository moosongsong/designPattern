package FactorysForCar;

import IngredientsForCar.Body;
import IngredientsForCar.Engine;
import IngredientsForCar.Wheel;

public abstract class Car {
	protected String name = null;
	protected Body body = null;
	protected Engine engine = null;
	protected Wheel wheel = null;
	
	public Car(String name, Body body, Engine engine, Wheel wheel) {
		this.name = name;
		this.body = body;
		this.engine = engine;
		this.wheel = wheel;
	}
	
	public abstract void run();

	@Override
	public String toString() {
		return "Car [" + name + ", " + body + ", " + engine + ", " + wheel + "]";
	}
	
	
}
