package src;

public abstract class Decorator extends Beverage{
	protected Beverage bv;
	
	public Decorator(String name, int cost, Beverage bv) {
		super(name, cost);
		this.bv=bv;
	}
	public String getName() {
		if(bv != null) {
			return bv.getName()+","+name;//첨가물의 내용 추가
		}
		return name;
	}
	public int getCost() {
		if(bv!=null) {
			return bv.getCost()+cost;
		}
		return cost;
	}
}
