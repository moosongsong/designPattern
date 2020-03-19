package 클론_자바본교재466;
//thin copy = thin clone
public class ThinAndDeep_Clone_AppStart {
	public static void func(int [] ary) {
		ary[2]=10;
		ary[4]=100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] f=new int[] {1,2,3,4,5};
		func(f);
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);//같은 인스턴스를 가리킨다.
		}
		
		CarForClone c =new SportsCar("벤츠", "검정", 250);
		SportsCar newCar = null;
		
		try {
			newCar = (SportsCar)((SportsCar)c).clone();
			newCar.setMaxSpeed(30000);
		} catch (CloneNotSupportedException e) {
			System.out.println("복제가 지원되지 않는 객체입니다.");
			e.printStackTrace();//JVM에게 clone 할 수 있는 객체임을 증명시켜줘야함.
			//cloneable를 implement하여 증명함.
			//this instanceof Cloneable
		}
		System.out.println(c);
		System.out.println(newCar);
//		
//		c.setColor("white");
//		c.setName("lolo");
//		System.out.println(c);
//		System.out.println(newCar);
		
	}
	

}
