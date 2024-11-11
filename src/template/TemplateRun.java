package template;

public class TemplateRun {
    public static void main(String[] args) {
        Food pizza = new Food("Pizza", 2);
        Food burger = new Food("Burger", 1);

        Order order1 = new Order();

        OrderItem pizzaOrder = new OrderItem(1, pizza);
        OrderItem burgerOrder = new OrderItem(3, burger);

        order1.addFoodItem(pizzaOrder);
        order1.addFoodItem(burgerOrder);
        order1.processOrder();
    }
}
