package src;

public class Machine {

	private InCoinState incoinState = new InCoinState(this);
	private NotCoinState notcoinState = new NotCoinState(this);
	private Coin_State currentState = notcoinState;

	public void setCurrentState(Coin_State currentState) {
		this.currentState = currentState;
	}

	public Coin_State getCurrentState() {
		return currentState;
	}

	public void inputCoin() {
		this.currentState.inputCoin();
	}

	public void turnLever() {
		this.currentState.turnLever();
	}

	public InCoinState getIncoinState() {
		return incoinState;
	}

	public void setIncoinState(InCoinState incoinState) {
		this.incoinState = incoinState;
	}

	public NotCoinState getNotcoinState() {
		return notcoinState;
	}

	public void setNotcoinState(NotCoinState notcoinState) {
		this.notcoinState = notcoinState;
	}

}
