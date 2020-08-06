package src;

public class Command_AppStart {

	public static void main(String[] args) {
		TV_PurpleBook tv =new TV_PurpleBook();
		Radio_PurpleBook radio = new Radio_PurpleBook();
		
		Command_PurpleBook tvOn = new TVOnCommand(tv);
		Command_PurpleBook tvOff = new TVOffCommand(tv);
		
		Command_PurpleBook radioOn = new RadioOnCommand(radio);
		Command_PurpleBook radioOff = new RadioOffCommand(radio);
		Command_PurpleBook radioUp = new RadioVolumeUpCommand(radio);
		Command_PurpleBook radioDown = new RadioVolumeDownCommand(radio);
		
		
		RemoteControl rc = new RemoteControl(4);
		
		rc.setCommand(0, tvOn, tvOff);
		rc.setCommand(1, radioOn, radioOff);
		rc.setCommand(2, radioUp, radioDown);
		
		rc.onButtonClicked(0);
		rc.onButtonClicked(1);
		rc.onButtonClicked(2);
		rc.undoButtonClicked();
		rc.offButtonClicked(0);
		rc.offButtonClicked(1);
		rc.offButtonClicked(2);
	}

}
