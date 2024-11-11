package mediator;

import java.util.HashMap;
import java.util.Map;

public class DeliveryMediator implements FoodMediator {
    private DeliveryService deliveryService;
    private RestaurantService restaurantService;
    private Map<Food, Integer> orderD = new HashMap<>();

    public DeliveryMediator(DeliveryService deliveryService, RestaurantService restaurantService) {
        this.deliveryService = deliveryService;
        this.restaurantService = restaurantService;
    }

    @Override
    public void orderFood(Food food, int quantity) {
        orderD.put(food, quantity);
        restaurantService.prepare(food, quantity);
        deliveryService.deliver(food, quantity);
    }

    @Override
    public void deliverOrder(Food food, int quantity) {
        deliveryService.deliver(food, quantity);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Map.Entry<Food, Integer> entry : orderD.entrySet()) {
            Food food = entry.getKey();
            int quantity = entry.getValue();
            totalPrice += food.calculateTotalPrice(quantity);
        }
        return totalPrice;
    }
}
