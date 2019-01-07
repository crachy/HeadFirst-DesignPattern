package biz.sucher.HeadFirst.DesignPatterns.WeatherStation;

import biz.sucher.HeadFirst.DesignPatterns.WeatherStation.DisplayElements.Observer_;

public interface Subject {
	public void registerObserver(Observer_ o);
	public void removeObserver(Observer_ o);
	public void notifyObservers();
	
}
