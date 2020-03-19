package 데코레이터패턴_보라교재;

public abstract class Beverage {
	protected String name;
	protected int cost;
	
	public Beverage(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public int getCost() {//교재에서는 하위에서 구현하라고 했는데 그냥 구현해버려~
		return cost;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
