package single_responsibility.good;


import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final int age;
    private float bill;
    List<Order> orders = new ArrayList<Order>();

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getBill() {
        return bill;
    }

    public void setBill(float bill) {
        this.bill = bill;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
