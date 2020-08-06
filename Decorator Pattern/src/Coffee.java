package src;

public class Coffee extends Beverage {
	
	public static final String PDNAME = "에스프레소";
	public static final int PDCOST = 2000;

	public Coffee() {
		super(PDNAME, PDCOST);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Coffee [name=" + name + ", cost=" + cost + "]";
	}
	
}
