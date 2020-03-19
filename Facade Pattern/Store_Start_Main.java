package Facade;

public class Store_Start_Main {
	//hooking 기법
	public static void main(String[] args) {
		Store st = new Store();
		
		Beverage bv = st.order("커피", false);//후킹? 흐르는 데이터를 잡아챈다. addcon이 빠져버렸기 때문

	}
}
