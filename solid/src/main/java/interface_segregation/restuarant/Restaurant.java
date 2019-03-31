package interface_segregation.restuarant;

public class Restaurant implements RestaurantAPI, Blik {
    @Override
    public void payByCreditCard() {
        System.out.println("Patnosc kartą!");
    }

    @Override
    public void payByCash() {
        System.out.println("Platnosc gotówką");
    }

    @Override
    public void orderInPerson() {
        System.out.println("Zamów na miejscu do stolika");
    }

    @Override
    public void orderByTelephone() {
        System.out.println("Zamów na wynos");
    }

    @Override
    public void payBlik() {
        System.out.println("Płatność blikiem!");
    }
}
