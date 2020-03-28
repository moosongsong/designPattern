
public class NotCoinState implements Coin_State {
	private Machine machine;

	public NotCoinState(Machine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void inputCoin() {
		System.out.println("동전이 삽입되었습니다.");
		machine.setCurrentState(machine.getIncoinState());

	}

	@Override
	public void turnLever() {
		System.out.println("상품을 뽑을 수 없습니다. 동전을 넣어주세요.");
	}

}
