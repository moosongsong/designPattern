package 펙토리메소드패턴;

public class PiizzaStore {
	private IngredientFactory factory;

	public void setFactory(IngredientFactory factory) {
		this.factory = factory;
	}
	
	public Pizza order() {
		System.out.println(factory+"에서 재료 공급!");
		return new Pizza(factory.createDough(),factory.createSauce(),factory.createCheese());
	}
}
