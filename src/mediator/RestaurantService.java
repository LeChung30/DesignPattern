package mediator;

public class RestaurantService {
    public void prepare(Food food, int quantity) {
        System.out.println("Preparing " + quantity + " " + food.getName());
    }
}
