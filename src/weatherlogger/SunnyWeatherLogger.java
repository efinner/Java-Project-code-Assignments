package weatherlogger;

public class SunnyWeatherLogger implements WeatherLogger{

	@Override
	public void report(String weatherType) {
		System.out.println(weatherType + "Its going to be a great day!!!");
		
	}

	@Override
	public void forecast(String weatherType, int daysAhead) {
	System.out.println("beatiful days ahead " + weatherType+ daysAhead );
		
	}

}
