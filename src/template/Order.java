package template;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<FoodItem> foodItems = new ArrayList<>();

    public void addFoodItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    public void processOrder() {
        for (FoodItem foodItem : foodItems) {
            foodItem.prepare();
            System.out.println("---------------------------");
        }
    }
}
