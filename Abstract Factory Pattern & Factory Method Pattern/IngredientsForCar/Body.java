package IngredientsForCar;

public abstract class Body {
	protected String name = null;

	public Body(String name) {
		this.name = name;
	}
	public abstract String getDescript();
	@Override
	public String toString() {
		return "[" + name + "]";
	}
	
	
}
