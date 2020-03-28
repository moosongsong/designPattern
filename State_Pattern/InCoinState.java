
public class InCoinState implements Coin_State {
	private Machine machine;

	public InCoinState(Machine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void inputCoin() {
		// TODO Auto-generated method stub
		System.out.println("동전이 이미 삽입되었습니다. 동전을 추가적으로 넣을 수 없습니다.");
	}

	@Override
	public void turnLever() {
		// TODO Auto-generated method stub
		System.out.println("레버를 돌렸습니다. 상품을 가져가세요.");
		machine.setCurrentState(machine.getNotcoinState());
	}

}
