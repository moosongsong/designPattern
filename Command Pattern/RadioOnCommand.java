package 커맨드패턴연습;

public class RadioOnCommand implements Command_PurpleBook{
	private Radio_PurpleBook radio = null;
	
	public RadioOnCommand(Radio_PurpleBook radio) {
		this.radio=radio;
	}
	@Override
	public void excute() {
		this.radio.on();
	}

	@Override
	public String getDescript() {
		return "RADIO ON";
	}
	
}
