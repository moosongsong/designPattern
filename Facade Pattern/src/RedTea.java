package src;

public class RedTea extends Beverage{
	private static String productName = "홍차";
	private static int productPrice=2500;
	
	public RedTea() {
		super(productName, productPrice);
	}

	public static void setProductName(String productName) {
		RedTea.productName = productName;
	}

	public static void setProductPrice(int productPrice) {
		RedTea.productPrice = productPrice;
	}

	@Override
	public void brew() {
		System.out.println(name+"을(를) 우립니다.");
	}

	@Override
	public void addCondiment() {
		System.out.println(name+"에 레몬을 첨가합니다.");
	}
}
