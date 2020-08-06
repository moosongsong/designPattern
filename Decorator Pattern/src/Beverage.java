package src;

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

	public int getCost() {//���翡���� �������� �����϶�� �ߴµ� �׳� �����ع���~
		return cost;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
