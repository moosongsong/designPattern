package src;

public class Double_AppStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleCollection c =new DoubleCollection();
		c.add(3.14);
		c.add(4.66);
		c.add(5.66);
		
		Iterator it = c.iterator();
		
		while(it.hasNext()) {
			double value = (double)it.next();
			System.out.println(value);
		}
	}
}
