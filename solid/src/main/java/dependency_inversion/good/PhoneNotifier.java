package dependency_inversion.good;

public class PhoneNotifier implements Notifier {
    public void generateWeatherConditionReport(String weatherCondition) {
        if (weatherCondition.equals("rainy")){
            System.out.println("Phone: It's rainy!");
        }
    }
}
