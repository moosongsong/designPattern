package 펙토리메소드패턴;

public abstract class IngredientFactory {
	public abstract Dough createDough();
	public abstract Sauce createSauce();
	public abstract Cheese createCheese();
	
	public abstract String toString();
}
