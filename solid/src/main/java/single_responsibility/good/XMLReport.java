package single_responsibility.good;

public class XMLReport implements Report {
    public void showReport(Customer customer) {
        System.out.println("XML report: ");
        System.out.println(customer);
    }
}
