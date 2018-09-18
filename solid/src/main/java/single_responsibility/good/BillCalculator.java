package single_responsibility.good;

public class BillCalculator {

    public float calculateBill(Customer customer, long taxValue) {
        float bill = 0;
        for (Order order : customer.getOrders()) {
            bill+=order.getOrderValue();
        }
        bill+=taxValue;
        customer.setBill(bill);
        return bill;
    }
}
