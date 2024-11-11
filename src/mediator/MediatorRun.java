package mediator;

public class MediatorRun {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();
        RestaurantService restaurantService = new RestaurantService();
        DeliveryMediator mediator = new DeliveryMediator(deliveryService, restaurantService);

        Food burger = new Food("Burger", 5);
        Food pizza = new Food("Pizza", 3);

        mediator.orderFood(burger, 2);
        mediator.orderFood(pizza, 1);

        System.out.println("Total price: " + mediator.calculateTotalPrice());

        DeliveryMediator mediator2 = new DeliveryMediator(deliveryService, restaurantService);
        mediator2.orderFood(burger, 1);
        System.out.println("Total price: " + mediator2.calculateTotalPrice());
    }
}
