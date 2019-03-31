package interface_segregation.restuarant;

public class App {

    public static void main(String[] args) {
        System.out.println("Aplikacja mobilna");
        MobileApp mobileRestaurantAPI = new MobileApp();
        mobileRestaurantAPI.orderOnline();
        mobileRestaurantAPI.payOnline();
        mobileRestaurantAPI.payBlik();

        System.out.println("Restauracja");
        Restaurant restaurantAPI = new Restaurant();
        restaurantAPI.payByCreditCard();
        restaurantAPI.payByCash();
        restaurantAPI.orderByTelephone();
        restaurantAPI.orderInPerson();
        restaurantAPI.payBlik();
    }
}
