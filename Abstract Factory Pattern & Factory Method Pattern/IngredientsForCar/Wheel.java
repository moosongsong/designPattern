package IngredientsForCar;

public abstract class Wheel {
	protected String name = null;

	public Wheel(String name) {
		this.name = name;
	}
	public abstract String getDescript();
	
	
	@Override
	public String toString() {
		return "[" + name + "]";
	}
	

}
