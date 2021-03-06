package interface_segregation.restuarant;

public class MobileApp implements MobileRestaurantAPI, Blik {

    @Override
    public void payOnline() {
        System.out.println("Plac aplikacją mobilną online!");
    }

    @Override
    public void orderOnline() {
        System.out.println("Zamów przez aplikację mobilnę");
    }

    @Override
    public void payBlik() {
        System.out.println("Platnosc blikiem!");
    }
}
