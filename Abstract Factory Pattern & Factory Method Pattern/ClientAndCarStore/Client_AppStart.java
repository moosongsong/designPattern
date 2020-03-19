package ClientAndCarStore;

import FactorysForCar.BenzCarFactory;
import FactorysForCar.BenzIngredientFactory;
import FactorysForCar.Car;

public class Client_AppStart {

	public static void main(String[] args) {
		CarStore store = new BenzCarStore();
		
		store.setCarFactory(new BenzCarFactory());
		store.factory.setIngredientFactory(new BenzIngredientFactory());
		
		Car car = store.order("Benz");
		
		System.out.println(car);
		
	}

}
