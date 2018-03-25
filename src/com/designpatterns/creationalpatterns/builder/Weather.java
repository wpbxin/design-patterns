package com.designpatterns.creationalpatterns.builder;
/**
 * 4. Product
 * @author WPB
 *
 */
public class Weather {

	private double temperature;
	private double humidity;
	private String weatherDescribe;
	//all getters and setters
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public String getWeatherDescribe() {
		return weatherDescribe;
	}
	public void setWeatherDescribe(String weatherDescribe) {
		this.weatherDescribe = weatherDescribe;
	}
}
