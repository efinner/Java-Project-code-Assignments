package weatherlogger;

public class WeatherApp {

	public static void main(String[] args) {
	WeatherLogger sunnyWeather = new SunnyWeatherLogger();
	WeatherLogger gloomyWeather = new RainyWeatherLogger();
	
	sunnyWeather.report("Very Sunny");
	sunnyWeather.forecast("sunny",40);
	
	gloomyWeather.report("Shiittty cold");
	gloomyWeather.forecast("so cold out", 60);
	

	}

}
