package 전략패턴_보라교재;

public class DonaldDuck extends Duck {

	public DonaldDuck() {
		super("도날드");
	}

	@Override
	public void fly() {
		System.out.println(name);
		flyalbe.doFly();
	}
	
}
