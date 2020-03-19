package 클론_자바본교재466;

public abstract class CarForClone implements Cloneable {
	protected String name;
	protected String color;
	
	public abstract String toString();
	
	public CarForClone(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}
//	
//	@Override
//	public String toString() {
//		return "CarForClone [name=" + name + ", color=" + color + "]";
//	}

	public Object clone() throws CloneNotSupportedException{
		Object o =super.clone();//car로 부터 clone 요청이 들어왔다.
		//그러면 오브젝트는 카랑 똑같은 메몰 확보하고 그 주소를 object타입으로 반환하는데
		//실제 인스턴스는 car이다.
		CarForClone car = (CarForClone)o;
		car.name=this.name;// string 은 내부에 서 변경이 불가능하므로 이건 이런식으로 대입하면 된다.
		car.color=this.color;
		return car;//object로 업캐스팅 되어서 반환
	}
}
