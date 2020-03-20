package FactorysForCar;

public abstract class CarFactory {
//	protected IngredientFactory factory = null;
	protected String name = null;
	
	public CarFactory(String name) {
		this.name = name;
	}
	
//	public void setIngredientFactory(IngredientFactory factory) {
//		this.factory=factory;
//	}
	
	public abstract Car createCar(String name) ;

	@Override
	public String toString() {
		return "[" +name + "]";
	}
	
	
}