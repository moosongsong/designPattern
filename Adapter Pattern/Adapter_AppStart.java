package 어댑터패턴_보라교재;

public class Adapter_AppStart {

	public static void main(String[] args) {
		Duck [] ds = {
			new Duck(),new TurkeyLikeDuck()	
		};
		
		ds[0].quack();
		ds[1].quack();
	}

}
