package 빌더_자바본교재_프로토타입;

public class Car {
	private String name;
	private String color;
	private int disp;
	
	public Car(String name, String color, int disp) {
		this.name = name;
		this.color = color;
		this.disp = disp;
	}
	
	public Car (Car car) {//복사생성자 애매해서 쓰지말장
		this.name=car.name;
		this.color=car.color;
		this.disp=car.disp;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getDisp() {
		return disp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setDisp(int disp) {
		this.disp = disp;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("차종:"+name+"\n");
		sb.append("색상:"+color+"\n");
		sb.append("배기량:"+disp+"cc");
		return sb.toString();
	}	
}
