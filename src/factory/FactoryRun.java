package factory;

public class FactoryRun {
    public static void main(String[] args) {
        Food pizza = FoodFactory.createFood("Pizza");
        Food burger = FoodFactory.createFood("Burger");

        pizza.prepare();
        System.out.println("Ordered: " + pizza.getName() + ", Price: $" + pizza.getPrice());

        burger.prepare();
        System.out.println("Ordered: " + burger.getName() + ", Price: $" + burger.getPrice());
    }
}
