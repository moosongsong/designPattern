package IngredientsForCar;

public abstract class Engine {
	protected String name = null;

	public Engine(String name) {
		this.name = name;
	}
	public abstract String getDescript();
	
	@Override
	public String toString() {
		return "[" + name + "]";
	}
	
	
}
