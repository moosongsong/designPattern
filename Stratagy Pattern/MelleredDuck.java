package 전략패턴_보라교재;

public class MelleredDuck extends Duck{

	public MelleredDuck() {
		super("천둥번개오리");
		
	}

	@Override
	public void fly() {
		System.out.println(name);
		flyalbe.doFly();
	}
	
}
