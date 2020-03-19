package 전략패턴_보라교재;

public class Duck_AppStart {

	public static void main(String[] args) {
		Duck d1 = new DonaldDuck();
		Duck d2 = new RubberDuck();
		Duck d3 = new MelleredDuck();
		
		d1.setFlyalbe(new FlyNoWay());
		d2.setFlyalbe(new FlyNoWay());
		d3.setFlyalbe(new FlyByWing());
		
		d1.fly();
		d2.fly();
		d3.fly();
		
		d1.setFlyalbe(new FlyByWing());
		d1.fly();
		
	}

}
