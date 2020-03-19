package 옵져버패턴_보라교재;

public class StaticDisplayer extends Observer{ //pool방식이당
	WeatherData wd;
	
	public void setWeatherData(WeatherData wd) {
		this.wd=wd;
	}
	
	
	@Override
	public void update() {
		int temp = wd.getTemp();
		int humi = wd.getHumi();
		int pres = wd.getPres();
		
		System.out.println("-----------------------");
		System.out.println("temp : "+temp);
		System.out.println("hymi : "+humi);
		System.out.println("pres : "+pres);
		System.out.println("------------------------");
	}
	
}
