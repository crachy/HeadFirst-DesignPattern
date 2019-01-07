package biz.sucher.HeadFirst.DesignPatterns.WeatherStation.DisplayElements;

import biz.sucher.HeadFirst.DesignPatterns.WeatherStation.Subject;

public class CurrentConditionDisplay_ implements Observer_, DisplayElement{

	public float temperature;
	public float humidity;
	public Subject weatherData;
	
	public CurrentConditionDisplay_(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature=temp;
		this.humidity=humidity;
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: "+temperature+"F degrees and "+humidity+"%humidity");

	}

}
