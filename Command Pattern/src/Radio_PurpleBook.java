package src;

public class Radio_PurpleBook {
	private int volume = 50;
	private boolean power = false;
	
	public void on() {
		power=true;
		System.out.println("Radio 켜짐");
	}
	public void off() {
		power=false;
		System.out.println("Radio 끔");
	}
	
	public void volumeUp() {
		volume=volume+1;
		System.out.println("volume Up:"+volume);
	}
	
	public void volumeDown() {
		volume=volume-1;
		System.out.println("volume Down:"+volume);
	}
}
