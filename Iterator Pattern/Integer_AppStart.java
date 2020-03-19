package 이터레이터연습;

public class Integer_AppStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerCollection ic =new IntegerCollection(100);
		ic.add(200);
		ic.add(300);
		ic.add(178129);
		
		Iterator it = ic.iterator();
		
		while(it.hasNext()) {
			int value = (int)it.next();
			System.out.println(value);
		}
		
		
	}

}
