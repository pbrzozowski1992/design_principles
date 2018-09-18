package dependency_inversion.bad;

public class EmailNotifier {

    public void generateWeatherReport(String weatherCondition) {
        System.out.println("Email: " + weatherCondition);
    }
}
