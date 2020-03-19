package 전략패턴_보라교재;

public class FlyNoWay implements Flyable{
	@Override
	public void doFly() {
		System.out.println("못날아여.");
	}
	
}
