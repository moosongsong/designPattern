package 펙토리메소드패턴;

public class Pizza_AppStart {

	public static void main(String[] args) {
		PiizzaStore store = new PiizzaStore();
		store.setFactory(new JoeunFoodFactory());
		Pizza pizza= store.order();
		System.out.println(pizza);
		
		//if new sauce added.
		store.setFactory(new MangFoodFactory());
		Pizza pizza2= store.order();
		System.out.println(pizza2);
	}
}
