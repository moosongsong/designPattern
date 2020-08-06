package src;

public class Observer_App_Start {

	public static void main(String[] args) {
		WeatherData wc = new WeatherData();//기상청1 만듦
		WeatherData aa =new WeatherData();//기창청 2
		
		Observer sd = new StaticDisplayer();
		
		//옵저버를 기상청에 등록하자
		wc.addObserver(sd);
//		aa.addObserver(sd);
		wc.setHumi(13);
		wc.setPres(20);
		wc.setTemp(20);
		wc.notifyObserver();
		
	}

}
