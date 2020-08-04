package src;
//page 514
public class Builder_AppStart {

	public static void main(String[] args) {
		Car car = new Car("meme", "red", 5000);//인수가 많게 되면 인수의 순서를 혼동할 수 있다.
		//인수의 순서가 맞다 하더라도, 주어지는 값이 틀릴수도 있다.예로 이름 색상 순이 아닌 색상 이름순
		//객체를 생성하는 데에 있어서 cost가 많이 든다.
		//고비용이 드는 경우 간단하게 객체를 생성하는 것이 빌더 패턴이다. 이 스트링 버퍼가 
		//빌더 패턴을 구현한 것이라고 보면 된다.
		
		System.out.println(car);
		
//		Car_Builder cb = new Car_Builder();//첫번째 방법
//		cb.setName("doll")
//		.setColor("blue")
//		.setDisp(1000);
		
		Car_Builder cb = Car_Builder.getBuilder();//2-1
		cb.setName("doll")
		.setColor("blue")
		.setDisp(1000);
		
		Car car1 = Car_Builder.getBuilder()//2-2
		.setName("dl")
		.setColor("skyblue")
		.setDisp(1000).getInstance();
		
		Car car2 = cb.setName("doll")//두번째 방법
				.setColor("blue")
				.setDisp(1000).getInstance();
		
		System.out.println(car1.toString());
		System.out.println(car2.toString());
	}

}
