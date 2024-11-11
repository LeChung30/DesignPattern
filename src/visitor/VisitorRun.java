package visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorRun {
    public static void main(String[] args) {
        Meal meal = new Meal("Chicken", 2.5);
        Vegetables vegetables = new Vegetables("Carrot", 1.5);
        Eggs eggs = new Eggs("Boiled eggs", 1.0);
        Drink drink = new Drink("Coca Cola", 1.0);

        List<Food> foodItems = new ArrayList<>();
        foodItems.add(meal);
        foodItems.add(vegetables);
        foodItems.add(eggs);
        foodItems.add(drink);

        FoodVisitor foodVisitor = new FoodVisitor();

        for (Food f: foodItems) {
            f.accept(foodVisitor);
        }

        foodVisitor.takeSale(meal, 0.3);

        vegetables.absent(foodVisitor);

        System.out.println(foodVisitor.getFoodNames() + " " + foodVisitor.getTotalPrice());
    }
}
