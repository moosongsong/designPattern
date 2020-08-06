package src;

public class WeatherData extends Subject {
	Observer[] ob;
	private int count;
	private int temp;
	private int humi;
	private int pres;
	
	public WeatherData() {
		ob = new Observer[10];
	}
	
	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		o.setWeatherData(this);
		if(count<ob.length) {
			ob[count++]=o;}
	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < count; i++) {
			ob[i].update();
		}
	}

	public Observer[] getOb() {
		return ob;
	}


	public int getCount() {
		return count;
	}


	public int getTemp() {
		return temp;
	}


	public int getHumi() {
		return humi;
	}


	public int getPres() {
		return pres;
	}


	public void setOb(Observer[] ob) {
		this.ob = ob;
	}


	public void setCount(int count) {
		this.count = count;
//		 notifyObserver();
	}


	public void setTemp(int temp) {
		this.temp = temp;
//		 notifyObserver();
	}


	public void setHumi(int humi) {
		this.humi = humi;
//		 notifyObserver();
	}


	public void setPres(int pres) {
		this.pres = pres;
//		 notifyObserver();
	}
}
