package ClientAndCarStore;

import FactorysForCar.Car;
import FactorysForCar.CarFactory;

public abstract class CarStore {
	protected CarFactory factory = null;
	protected String name = null;
	
	public CarStore(String name) {
		this.name = name;
	}
	
	public void setCarFactory(CarFactory factory) {
		this.factory = factory;
	}
	
	public abstract Car order(String name) ;
}
