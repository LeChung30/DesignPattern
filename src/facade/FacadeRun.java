package facade;

import java.util.ArrayList;

public class FacadeRun {
    public static void main(String[] args) {
        ArrayList<Food> foods = new ArrayList<>();
        foods.add(new Food("BanhMi", "Full topping", 15000));
        foods.add(new Food("Pho", "Full topping", 40000));
        foods.add(new Food("BanhCuon", "Full topping", 35000));

        FoodDeliveryFacade facade = new FoodDeliveryFacade();

        facade.showRestaurants();

        facade.orderFood(foods.get(0), 2);
        facade.orderFood(foods.get(1), 1);
        facade.orderFood(foods.get(2), 3);
    }
}
