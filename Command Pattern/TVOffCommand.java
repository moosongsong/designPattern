package 커맨드패턴연습;

public class TVOffCommand implements Command_PurpleBook{
	private TV_PurpleBook tv=null;
	
	public TVOffCommand(TV_PurpleBook tv) {
		this.tv = tv;
	}

	@Override
	public void excute() {
		this.tv.off();
	}

	@Override
	public String getDescript() {
		return "TV OFF";
	}
	
}
