package com.designpatterns.creationalpatterns.builder;
/**
 * 2. ConcreteBuilder -- ColdWeatherBuilder
 * @author WPB
 *
 */
public class ColdWeatherBuilder implements WeatherBuilder{

	private Weather weather;
	public ColdWeatherBuilder(){
		weather = new Weather();
		System.out.println("Build ColdWeatherBuilder");
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
