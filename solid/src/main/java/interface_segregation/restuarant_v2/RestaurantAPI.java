package interface_segregation.restuarant_v2;

public interface RestaurantAPI extends Blik {
    void payByCreditCard();
    void payByCash();
    void orderInPerson();
    void orderByTelephone();
}
