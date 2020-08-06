package src;

public class Beverage_AppStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage b =new Coffee();
		b = new Sugar(b);
		b=new Sugar(b);
		b=new Lemon(b);
		System.out.println(b.getName()+":"+b.getCost());
		//scanner, I/O Stream 이 데코레이터 패턴으로 만들어져 있다.
		
		Beverage b1 = new Lemon(null);
		b1 = new Lemon(b1);
		System.out.println(b1.getName()+":"+b1.getCost());
	}

}
