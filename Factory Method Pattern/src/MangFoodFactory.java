package src;

public class MangFoodFactory extends IngredientFactory{

	@Override
	public Dough createDough() {
		return new BlackDough();
	}

	@Override
	public Sauce createSauce() {
		return new HotSauce();
	}

	@Override
	public Cheese createCheese() {
		return new GodaCheese();
	}

	@Override
	public String toString() {
		return "Mang Food Factory";
	}

}
