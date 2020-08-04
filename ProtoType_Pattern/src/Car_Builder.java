package src;

public class Car_Builder {//싱글톤으로 구현
	private Car car;//프로토타입 요청할때 마다 원본이 복사본을 넘기는 것.
	private static Car_Builder builder= null;
	
	//자동차를 만들기 위한 도구
	private Car_Builder() {//new 불가
		//여기서 car를 만들었으면 자동차가 하나밖에 생성 안됨.
//		this.car= new Car("소나타", "검정", 2500);
	}
	
	public static Car_Builder getBuilder() {
		if(builder==null) {
			builder= new Car_Builder();
		}
		builder.car = new Car("소나타", "검정", 2500);
		return builder;
	}
	
	public Car_Builder setName(String name) {
		this.car.setName(name);
		return this;
	}
	
	public Car_Builder setColor(String color) {
		this.car.setColor(color);
		return this;
	}
	
	public Car_Builder setDisp(int disp) {
		this.car.setDisp(disp);
		return this;
	}
	
	public Car getInstance() {
		return new Car(car.getName(), car.getColor(), car.getDisp());
//		return new Car(car);//애매하기 때문에 사용을 못함.
	}
	
}
