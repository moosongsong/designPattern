package src;

public abstract class Cheese {
	protected String name = null;

	public Cheese(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "[" + name + "]";
	}
	
	
}
