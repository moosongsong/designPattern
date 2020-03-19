package 데코레이터패턴_보라교재;

public class Sugar extends Decorator{
	
	public static final String PDNAME="설탕";
	public static final int PDCOST=200;

	public Sugar(Beverage bv) {
		super(PDNAME, PDCOST, bv);
	}

	@Override
	public String toString() {
		return "Sugar [bv=" + bv + ", name=" + name + ", cost=" + cost + "]";
	}
	
}
