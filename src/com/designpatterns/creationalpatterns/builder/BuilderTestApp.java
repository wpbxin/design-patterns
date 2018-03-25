package com.designpatterns.creationalpatterns.builder;

/**
 * <p>
 * 3. Director : constructs an object using the Builder interface.
 * <p>
 * This is the test-main.
 * <p>
 * @author WPB
 *
 */
public class BuilderTestApp {
	//Here we use main-test as a Director
	public static void main(String[] args) {
		//use the Builder
		WeatherBuilder hwb = new HotWeatherBuilder();
		hwb.setHumidity(90.0);
		hwb.setTemperature(35.0);
		hwb.setWeatherDescribe("It is too hot.");
		//then get the product
		Weather hw = hwb.buildWeather();
		System.out.println("Humidity : " + hw.getHumidity());
		System.out.println("Temperature : " + hw.getTemperature());
		System.out.println("WeatherDescribe : " + hw.getWeatherDescribe());
		
		WeatherBuilder cwb = new ColdWeatherBuilder();
		cwb.setHumidity(30.0);
		cwb.setTemperature(-5.0);
		cwb.setWeatherDescribe("It is too cold.");
		Weather cw = cwb.buildWeather();
		System.out.println("Humidity : " + cw.getHumidity());
		System.out.println("Temperature : " + cw.getTemperature());
		System.out.println("WeatherDescribe : " + cw.getWeatherDescribe());
	}
}
