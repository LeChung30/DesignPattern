package Decorator;

public class DecoratorRun {
    public static void main(String[] args) {
        IFood burger = new BaseFood("Burger", 5.0);

        burger = new DrinkDecorator(burger, "Coke", 2.0);
        burger = new MealDecorator(burger, "Chicken", 10.0);
        burger = new VegetableDecorator(burger, "Salad", 2.0);

        System.out.println("Combo: " + burger.getName());
        System.out.println("Total: " + burger.getPrice());
    }
}
