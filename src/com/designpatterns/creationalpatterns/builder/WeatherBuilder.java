package com.designpatterns.creationalpatterns.builder;

/**
 * 1. Builder
 * @author WPB
 *
 */
public interface WeatherBuilder {

	public void setTemperature(double temperature);
	public void setHumidity(double humidity);
	public void setWeatherDescribe(String weatherDescribe);
	public Weather buildWeather();
}
