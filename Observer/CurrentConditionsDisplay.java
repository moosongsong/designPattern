
public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private double tempereture;
	private double humidity;
	private double pressure;
	private Subject watherData;
	
	CurrentConditionsDisplay(Subject weatherData){
		this.watherData = weatherData;
		weatherData.regidterObserver(this);
	}

	@Override
	public void display() {
		System.out.println(this);
	}

	@Override
	public void update(double temp, double humidity, double pressure) {
		this.tempereture = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public String toString() {
		return "CurrentConditionsDisplay [tempereture=" + tempereture + ", humidity=" + humidity + ", pressure="
				+ pressure + ", watherData=" + watherData + "]";
	}
	
	
}
