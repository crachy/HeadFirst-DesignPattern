package biz.sucher.HeadFirst.DesignPatterns.WeatherStation;

import biz.sucher.HeadFirst.DesignPatterns.WeatherStation.DisplayElements.CurrentConditionDisplay_;
import biz.sucher.HeadFirst.DesignPatterns.WeatherStation.DisplayElements.HeatDisplay;

public class WeatherStation {
	public static void main (String [] args) {
		WeatherData_ wd = new WeatherData_();
		
		CurrentConditionDisplay_ ccd = new CurrentConditionDisplay_(wd);
		HeatDisplay hd = new HeatDisplay(wd);
		
		wd.setMeasurements(80, 65, 12.34f);
		wd.setMeasurements(80, 60, 12.00f);
		wd.setMeasurements(80, 60, 12.50f);
		wd.setMeasurements(79, 65, 12.34f);
	}
}
