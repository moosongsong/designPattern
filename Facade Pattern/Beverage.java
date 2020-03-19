package Facade;

public abstract class Beverage {
	protected String name;
	protected int price;
	
	public Beverage(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void creator(boolean condiment) { //요게 facade 이다.
		boilWater();
		brew();
		pourInCup();
		if(condiment) {
			addCondiment();
		}
		
	}

	public void boilWater() {
		System.out.println(name+"(을)를 위한 물끓이기");
	}
	public void pourInCup() {
		System.out.println(name+"(을)를 컵에 따릅니다.");
	}
	
	public abstract void brew();
	public abstract void addCondiment();
}
