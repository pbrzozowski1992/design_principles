package dependency_inversion.good;

public class WeatherReport {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier phoneNotifier = new PhoneNotifier();
        WeatherTracker weatherTracker = new WeatherTracker(emailNotifier);
        WeatherTracker weatherTracker1 = new WeatherTracker(phoneNotifier);
        weatherTracker.setWeatherCondition("sunny");
        weatherTracker1.setWeatherCondition("sunny");
        weatherTracker.notifyAboutWeatherCondition();
        weatherTracker.notifyAboutWeatherCondition();

        weatherTracker.setWeatherCondition("rainy");
        weatherTracker1.setWeatherCondition("rainy");
        weatherTracker.notifyAboutWeatherCondition();
        weatherTracker.notifyAboutWeatherCondition();
    }
}
