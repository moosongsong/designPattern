package Singleton.src;

public class ThisIsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLady m1 = MyLady.getInstance();
		MyLady m2 = MyLady.getInstance();
		System.out.println(m1);
		System.out.println(m2);
		
	}

}
