package dependency_inversion.bad;

public class WeatherReport {
    public static void main(String[] args) {
        WeatherTracker weatherTracker = new WeatherTracker();
        weatherTracker.sendCurrentWeatherCondition("sunny");
        weatherTracker.sendCurrentWeatherCondition("rainy");
    }
}
