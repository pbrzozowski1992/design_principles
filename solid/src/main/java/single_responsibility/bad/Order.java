package single_responsibility.bad;

public class Order {
    private String orderName;
    private float orderValue;

    public Order(String orderName, float orderValue) {
        this.orderName = orderName;
        this.orderValue = orderValue;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public float getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(float orderValue) {
        this.orderValue = orderValue;
    }
}
