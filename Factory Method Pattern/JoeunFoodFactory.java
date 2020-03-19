package 펙토리메소드패턴;

public class JoeunFoodFactory extends IngredientFactory{

	@Override
	public Dough createDough() {
		return new BlackDough();
	}

	@Override
	public Sauce createSauce() {
		return new TomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new GodaCheese();
	}

	@Override
	public String toString() {
		return "Jeeun Food Factory";
	}

}
