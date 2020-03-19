package Singleton;

public class MyLady {
	//private static MyLady instance = new MyLady();//이렇게 객체를 만들어!
	
	private static MyLady instance = null;//사용할때 사용하기 싫을때
	
//	static {
//		instance = new MyLady();
//	}// 이렇게 써도됨.
	private MyLady() {//생성자 숨기기. 이래야 호출 직접적으로 불가 -> 클래스 메소드 이용해서 호출.
		
	}
	public static MyLady getInstance() {
		//return new MyLady();//그래도 얘는 근본적인 해답이 될 수 없다.
		if(instance == null) {
			instance=new MyLady();
		}
		return instance;
	}
	
	public String toString() {//이게 출력 대표! 오버라이딩인가?
		return "너는 나의 하나 뿐인 그대";
		//println, print 출력 메소드의 객체가 주어지는 경우에는 
		//주어지는 객체의 toString() 메소드가 반환하는 값을 출력합니다.
		
	}
}
