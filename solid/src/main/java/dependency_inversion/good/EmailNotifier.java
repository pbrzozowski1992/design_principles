package dependency_inversion.good;

public class EmailNotifier implements Notifier{
    public void generateWeatherConditionReport(String weatherCondition) {
        if (weatherCondition.equals("sunny")) {
            System.out.println("Email: it's sunny");
        }
    }
}
