package 전략패턴_보라교재;

public class FlyByWing implements Flyable{

	@Override
	public void doFly() {
		System.out.println("날개짓을 하며 날아요!");
	}

}
