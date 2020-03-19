package 펙토리메소드패턴;

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
