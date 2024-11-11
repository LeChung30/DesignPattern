package mediator;

public class DeliveryService {
    public void deliver(Food food, int quantity) {
        System.out.println("Delivering " + quantity + " " + food.getName());
    }
}
