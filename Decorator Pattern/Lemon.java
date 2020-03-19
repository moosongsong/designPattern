package 데코레이터패턴_보라교재;

public class Lemon extends Decorator{
	private static final String PSNAME="Lemon";
	private static final int PDCOST=500;
	
	public Lemon(Beverage bv) {
		super(PSNAME, PDCOST, bv);
	}
}
