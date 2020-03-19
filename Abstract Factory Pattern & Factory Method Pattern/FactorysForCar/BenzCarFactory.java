package FactorysForCar;

public class BenzCarFactory extends CarFactory{

	public BenzCarFactory() {
		super("Benz Car Factory");
	}

	@Override
	public Car createCar(String name) {
		return new BenzCar(factory.createBody(), factory.createEngine(), factory.createWheel());
	}
	
}
