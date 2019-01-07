package biz.sucher.HeadFirst.DesignPatterns.WeatherStation;

import java.util.ArrayList;

import biz.sucher.HeadFirst.DesignPatterns.WeatherStation.DisplayElements.Observer_;

public class WeatherData_ implements Subject {

	private ArrayList<Observer_> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData_() {
		observers = new ArrayList<Observer_>();
	}
	
	@Override
	public void registerObserver(Observer_ o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer_ o) {
		int i = observers.indexOf(o);
		if (i>=0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer_ o : observers) {
			o.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
