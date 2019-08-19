package com.amdocs;

public interface iObservable {
	
	public void addSubscriber(IObserver observer);
	public void removeSubscriber(IObserver observer);
	public void notifyAllSubscriber(String message);

}
