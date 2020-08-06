package src;

public class RemoteControl {
	private int num;
	
	private Command_PurpleBook [] onCmds=null;
	private Command_PurpleBook [] offCmds=null;
	private Command_PurpleBook undoCmds=null;
	
	
	
	public RemoteControl(int num) {
		this.num = num;
		onCmds = new Command_PurpleBook[num];
		offCmds = new Command_PurpleBook[num];
//		undoCmds = new Command_PurpleBook[num];
	}

	public void setCommand(int index, Command_PurpleBook onCmd, Command_PurpleBook offCmd) {
		try {
			onCmds[index] = onCmd;
			offCmds[index] = offCmd;
//			undoCmds[index]=offCmd;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Wrong Slot number");
			System.err.println("사용가능한 마지막 번지:"+(num-1));
		}
	}
	
	public void onButtonClicked(int index) {
		try {
			onCmds[index].excute();
			undoCmds=offCmds[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Wrong Slot number");
			System.err.println("사용가능한 마지막 번지:"+(num-1));
		}catch (NullPointerException e) {
			System.err.println("해당 슬롯의 명령 없음");
			System.out.println("==on==");
			for (int i = 0; i < num; i++) {
				if(onCmds[i]==null) {
					System.out.println("empty");
				}
				else {
					System.out.println(onCmds[i].getClass().getName());
				}
			}
		}
	}
	
	public void offButtonClicked(int index) {
		try {
			offCmds[index].excute();
			undoCmds=onCmds[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Wrong Slot number");
			System.err.println("사용가능한 마지막 번지:"+(num-1));
		}catch (NullPointerException e) {
			System.err.println("해당 슬롯의 명령 없음");
			
			System.out.println("==off==");
			for (int i = 0; i < num; i++) {
				if(offCmds[i]==null) {
					System.out.println("empty");
				}
				else {
					System.out.println(offCmds[i].getClass().getName());
				}
			}
		}
	}
	
	public void undoButtonClicked() {
		try {
			undoCmds.excute();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Wrong Slot number");
			System.err.println("사용가능한 마지막 번지:"+(num-1));
		}catch (NullPointerException e) {
			System.err.println("empty");
		}
	}
}
