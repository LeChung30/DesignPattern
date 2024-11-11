package factory;

public class FoodFactory {
    public static Food createFood(String name) {
        if (name.equals("Pizza")) {
            return new Pizza();
        } else if (name.equals("Burger")) {
            return new Burger();
        } else {
            return null;
        }
    }
}
