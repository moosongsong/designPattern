package ClientAndCarStore;

import FactorysForCar.BenzCarFactory;
import FactorysForCar.BenzIngredientFactory;
import FactorysForCar.Car;

public class Client_AppStart {

	public static void main(String[] args) {
		CarStore store = new BenzCarStore();
		
		store.setCarFactory(new BenzCarFactory());

		Car car = store.order("BMW");
		
		System.out.println(car);
		
	}

}
