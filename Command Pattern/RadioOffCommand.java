package 커맨드패턴연습;

public class RadioOffCommand implements Command_PurpleBook{
	private Radio_PurpleBook radio=null;
	
	
	public RadioOffCommand(Radio_PurpleBook radio) {
		this.radio = radio;
	}

	@Override
	public void excute() {
		this.radio.off();
	}

	@Override
	public String getDescript() {
		return "RADIO OFF";
	}

}
