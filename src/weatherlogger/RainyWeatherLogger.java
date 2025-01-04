package weatherlogger;

public class RainyWeatherLogger implements WeatherLogger {

	@Override
	public void report(String weatherType) {
		System.out.println(weatherType + "Its going to be a shitty day :(");
		
	}

	@Override
	public void forecast(String weatherType, int daysAhead) {
		System.out.println(weatherType + "Ugh how many days are we going to have like this " + daysAhead + "days");
		
	}

}
