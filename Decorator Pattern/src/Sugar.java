package src;

public class Sugar extends Decorator{
	
	public static final String PDNAME="����";
	public static final int PDCOST=200;

	public Sugar(Beverage bv) {
		super(PDNAME, PDCOST, bv);
	}

	@Override
	public String toString() {
		return "Sugar [bv=" + bv + ", name=" + name + ", cost=" + cost + "]";
	}
}
