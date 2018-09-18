package single_responsibility.good;


public class CustomerService {

    public static void main(String[] args) {
        ReportGenerator reportGenerator = new ReportGenerator();
        BillCalculator billCalculator = new BillCalculator();
        Customer customer = new Customer("Brzozowski", 26);
        Order order = new Order("Tablet", 2199.89f);
        Order order1 = new Order("myszka", 39.99f);
        customer.addOrder(order);
        customer.addOrder(order1);
        reportGenerator.generateReport(customer, new CSVReport());
        billCalculator.calculateBill(customer, 20);
    }
}
