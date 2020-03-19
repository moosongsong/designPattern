package 옵져버패턴_보라교재;

public abstract class Subject {
	public abstract void addObserver (Observer o) ;
	public abstract void notifyObserver();
}
