package src;

import src.Observer;

public interface Subject {
	public void regidterObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}
