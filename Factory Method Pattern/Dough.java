package 펙토리메소드패턴;

public abstract class Dough {
	protected String name = null;

	public Dough(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[" + name + "]";
	}
	
}
