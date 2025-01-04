package weatherlogger;

public interface WeatherLogger {
	void report(String weatherType);
	void forecast(String weatherType, int daysAhead);

}
