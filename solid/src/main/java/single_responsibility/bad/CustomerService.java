package single_responsibility.bad;

public class CustomerService {

    public static void main(String[] args) {
        Customer customer = new Customer("Brzozowski", 26);
        Order order = new Order("Tablet", 2199.89f);
        Order order1 = new Order("myszka", 39.99f);
        customer.addOrder(order);
        customer.addOrder(order1);
        customer.generateReport("CSV");
        customer.calculateBill(20);
    }
}
