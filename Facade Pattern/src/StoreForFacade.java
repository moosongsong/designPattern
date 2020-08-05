package src;

public class StoreForFacade {

	public Beverage order(String name, boolean condiment) {
		Beverage bv = null;
		switch (name) {
		case "커피":
			bv = new Coffee();
			break;
		case "홍차":
			bv = new RedTea();
			break;
		default:
			break;
		}
		
		if(bv != null) {
			bv.creator(condiment);
		}
		else {
			System.out.println(name+"은(는) 본 점에서는 취급 노논");
		}
		return bv;
	}

}
