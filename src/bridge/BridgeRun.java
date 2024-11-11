package bridge;

public class BridgeRun {
    public static void main(String[] args) {
        IFood bread = new BaseFood("Bread", 2.5);
        OrderFood orderFood = new OrderFood(bread);
        orderFood.details(2);

        IFood pizza = new BaseFood("pizza", 5);
        orderFood = new OrderFood(pizza);
        orderFood.details(5);
    }
}
