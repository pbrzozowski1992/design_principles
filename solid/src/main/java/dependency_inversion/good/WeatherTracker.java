package dependency_inversion.good;

public class WeatherTracker {
    private String weatherCondition;
    private Notifier notifier;

    public WeatherTracker(Notifier notifier) {
        this.notifier = notifier;
    }

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public void notifyAboutWeatherCondition() {
        notifier.generateWeatherConditionReport(weatherCondition);
    }
}
