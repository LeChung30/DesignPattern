package visitor;

import java.util.ArrayList;
import java.util.List;

public class FoodVisitor implements IFoodVisitor {
    private double totalPrice = 0;
    private List<String> foodNames = new ArrayList<>();

    @Override
    public void addOrder(Drink drink) {
        totalPrice += drink.getPrice();
        foodNames.add(drink.getName());
    }

    @Override
    public void addOrder(Eggs eggs) {
        totalPrice += eggs.getPrice();
        foodNames.add(eggs.getName());
    }

    @Override
    public void addOrder(Meal meal) {
        totalPrice += meal.getPrice();
        foodNames.add(meal.getName());
    }

    @Override
    public void addOrder(Vegetables vegetables) {
        totalPrice += vegetables.getPrice();
        foodNames.add(vegetables.getName());
    }

    @Override
    public void removeOrder(Drink drink) {
        totalPrice -= drink.getPrice();
        foodNames.remove(drink.getName());
    }

    @Override
    public void removeOrder(Eggs eggs) {
        totalPrice -= eggs.getPrice();
        foodNames.remove(eggs.getName());
    }

    @Override
    public void removeOrder(Meal meal) {
        totalPrice -= meal.getPrice();
        foodNames.remove(meal.getName());
    }

    @Override
    public void removeOrder(Vegetables vegetables) {
        totalPrice -= vegetables.getPrice();
        foodNames.remove(vegetables.getName());
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getFoodNames() {
        return String.join(", ", foodNames);
    }

    public void takeSale(Drink drink, double discount) {
        totalPrice -= drink.getPrice() * discount;
    }

    @Override
    public void takeSale(Eggs eggs, double discount) {
        totalPrice -= eggs.getPrice() * discount;
    }

    @Override
    public void takeSale(Meal meal, double discount) {
        totalPrice -= meal.getPrice() * discount;
    }

    @Override
    public void takeSale(Vegetables vegetables, double discount) {
        totalPrice -= vegetables.getPrice() * discount;
    }
}