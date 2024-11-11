package iterator;

import mediator.Food;

import java.util.HashMap;
import java.util.Map;

public class ItreratorRun {
    public static void main(String[] args) {
        Food pizza = new Food("Pizza", 5);
        Food burger = new Food("Burger", 3);
        Food coke = new Food("Coke", 2);

        Map<Food, Integer> orders = new HashMap<>();

        OrderIterator orderIterator = new OrderIterator(orders);
        orderIterator.addOrder(pizza, 1);
        orderIterator.addOrder(burger, 3);
        orderIterator.addOrder(coke, 3);

        while (orderIterator.hasNext()) {
            Map.Entry<Food, Integer> entry = orderIterator.next();
            System.out.println("Ordered: " + entry.getKey().getName() + ", Quantity: " + entry.getValue());
        }

        System.out.println("Total Price: " + orderIterator.getTotalPrice());
    }
}
