package com.designpatterns.creationalpatterns.builder;
/**
 * 2. ConcreteBuilder -- HotWeatherBuilder
 * @author WPB
 *
 */
public class HotWeatherBuilder implements WeatherBuilder{

	private Weather weather;
	public HotWeatherBuilder() {
		weather = new Weather();
		System.out.println("Build HotWeatherBuilder");
	}
	@Override
	public void setTemperature(double temperature) {
		this.weather.setTemperature(temperature);
	}

	@Override
	public void setHumidity(double humidity) {
		this.weather.setHumidity(humidity);
	}

	@Override
	public void setWeatherDescribe(String weatherDescribe) {
		this.weather.setWeatherDescribe(weatherDescribe);		
	}

	@Override
	public Weather buildWeather() {
		return this.weather;
	}

}
