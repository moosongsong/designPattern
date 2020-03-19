package 커맨드패턴연습;

public class RadioVolumeDownCommand implements Command_PurpleBook{
	private Radio_PurpleBook radio = null;
	
	public RadioVolumeDownCommand(Radio_PurpleBook radio) {
		this.radio = radio;
	}

	@Override
	public void excute() {
		this.radio.volumeDown();
	}

	@Override
	public String getDescript() {
		return "RADIO VOLUME DOWN";
	}

}
