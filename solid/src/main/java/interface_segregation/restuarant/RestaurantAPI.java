package interface_segregation.restuarant;

public interface RestaurantAPI {
    void payByCreditCard();
    void payByCash();
    void orderInPerson();
    void orderByTelephone();
}
