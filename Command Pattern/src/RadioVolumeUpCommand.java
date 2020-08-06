package src;

public class RadioVolumeUpCommand implements Command_PurpleBook{
	private Radio_PurpleBook radio = null;
	
	
	
	public RadioVolumeUpCommand(Radio_PurpleBook radio) {
		this.radio = radio;
	}

	@Override
	public void excute() {
		this.radio.volumeUp();
	}

	@Override
	public String getDescript() {
		return "RADIO VOLUME UP";
	}

}
