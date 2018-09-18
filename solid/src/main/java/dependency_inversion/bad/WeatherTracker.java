package dependency_inversion.bad;

public class WeatherTracker {
    private String currentCondition;
    private EmailNotifier emailNotifier;
    private PhoneNotifier phoneNotifier;

    public WeatherTracker() {
        phoneNotifier = new PhoneNotifier();
        emailNotifier = new EmailNotifier();
    }

    public void sendCurrentWeatherCondition(String weatherCondition) {
        this.currentCondition = weatherCondition;
        if (currentCondition.equals("rainy")) {
            phoneNotifier.generateWeatherReport(currentCondition);
        } else if (currentCondition.equals("sunny")) {
            emailNotifier.generateWeatherReport(currentCondition);
        }
    }
}
