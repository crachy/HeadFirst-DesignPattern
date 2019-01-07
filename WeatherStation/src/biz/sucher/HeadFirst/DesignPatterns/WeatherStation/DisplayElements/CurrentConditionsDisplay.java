package biz.sucher.HeadFirst.DesignPatterns.WeatherStation.DisplayElements;

import java.util.Observable;
import java.util.Observer;

import biz.sucher.HeadFirst.DesignPatterns.WeatherStation.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable observer, Object arg) {
		if (observer instanceof WeatherData) {
			WeatherData wd = (WeatherData) observer;
			this.temperature=wd.getTemperature();
			this.humidity=wd.getHumidity();
			display();
		}
		
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: "+temperature+"F degrees and "+humidity+"%humidity");
	}

}
