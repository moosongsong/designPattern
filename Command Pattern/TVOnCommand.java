package 커맨드패턴연습;

public class TVOnCommand implements Command_PurpleBook{
	private TV_PurpleBook tv=null;
	
	public TVOnCommand(TV_PurpleBook tv) {
		this.tv = tv;
	}

	@Override
	public void excute() {
		this.tv.on();
	}

	@Override
	public String getDescript() {
		return "TV ON";
	}
	
}
