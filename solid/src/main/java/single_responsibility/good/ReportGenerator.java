package single_responsibility.good;

public class ReportGenerator {

    public void generateReport(Customer customer, Report report) {
        report.showReport(customer);
    }
}
