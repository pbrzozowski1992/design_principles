package dependency_inversion.bad;

public class PhoneNotifier {

    public void generateWeatherReport(String weatherCondition) {
        System.out.println("Phone: " + weatherCondition);
    }
}
