package 클론_자바본교재466;

public class SportsCar extends CarForClone {//implements Cloneable 이거 상위 클래스에서 해서 굳이 할 필요 없음
	private int maxSpeed;

	public SportsCar(String name, String color, int maxSpeed) {
		super(name, color);
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "이름:"+name+"색상:"+color+"최대속도:"+maxSpeed;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Object temp = super.clone();
		SportsCar sc = (SportsCar)temp;
		sc.maxSpeed=this.maxSpeed;
		return sc;
	}
	
}
