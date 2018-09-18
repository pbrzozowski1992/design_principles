package single_responsibility.good;

public class CSVReport implements Report {
    public void showReport(Customer customer) {
        System.out.println("CSV report: ");
        System.out.println(customer);
    }
}
