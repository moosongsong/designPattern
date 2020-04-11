import java.util.ArrayList;

public class WeatherData implements Subject{
	private ArrayList<Observer> observers;
	private double tempereture;
	private double humidity;
	private double pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void regidterObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i>=0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(tempereture, humidity, pressure);
		}
		
	}
	
	public void measuremaentsChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(double temp, double hum, double pre) {
		this.tempereture = temp;
		this.humidity = hum;
		this.pressure = pre;
		measuremaentsChanged();
	}
	
}
