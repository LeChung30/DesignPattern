package mediator;

public interface FoodMediator {
    void orderFood(Food food, int quantity);
    void deliverOrder(Food food, int quantity);
}
