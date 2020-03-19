package 펙토리메소드패턴;

public class Pizza {
	private Dough dough;
	private Sauce sauce;
	private Cheese chesse;
	
	public Pizza(Dough dough, Sauce sauce, Cheese chesse) {
		this.dough = dough;
		this.sauce = sauce;
		this.chesse = chesse;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Pizza").append(dough.toString()).append(sauce.toString()).append(chesse.toString());
//		return "Pizza dough=" + dough + ", sauce=" + sauce + ", chesse=" + chesse;
		return sb.toString();
	}
	
	
	
}
