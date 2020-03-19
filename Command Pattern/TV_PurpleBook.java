package 커맨드패턴연습;

public class TV_PurpleBook {
	private boolean power=false;
	
	public void on() {
		power=true;
		System.out.println("TV 켜짐");
	}
	public void off() {
		power=false;
		System.out.println("TV 끔");
	}
}
