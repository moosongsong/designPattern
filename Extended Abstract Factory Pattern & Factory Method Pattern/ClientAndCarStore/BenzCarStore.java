package ClientAndCarStore;

import FactorysForCar.Car;

public class BenzCarStore extends CarStore{

	public BenzCarStore() {
		super("Benz Car Store");
	}

	@Override
	public Car order(String name) {
		return factory.createCar(name);
	}

}
