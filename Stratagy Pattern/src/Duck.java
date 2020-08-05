package src;

public abstract class Duck {

	protected Flyable flyalbe;
	protected String name;
	
	public abstract void fly() ;
	
	public Duck(String name) {
		this.name=name;
	}

	public Flyable getFlyalbe() {
		return flyalbe;
	}

	public String getName() {
		return name;
	}

	public void setFlyalbe(Flyable flyalbe) {
		this.flyalbe = flyalbe;
	}

	public void setName(String name) {
		this.name = name;
	}
}
