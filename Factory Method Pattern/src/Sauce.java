package src;

public abstract class Sauce {
	protected String name = null;

	public Sauce(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[" + name + "]";
	}
	
	
}
