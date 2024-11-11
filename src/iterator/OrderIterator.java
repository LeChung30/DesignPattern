package iterator;

import mediator.Food;

import java.util.Iterator;
import java.util.Map;

public class OrderIterator implements Iterator<Map.Entry<Food, Integer>> {
    private Map<Food, Integer> orders; // Thêm tham chiếu đến Map orders
    private Iterator<Map.Entry<Food, Integer>> iterator;

    public OrderIterator(Map<Food, Integer> orders) {
        this.orders = orders; // Gán trực tiếp đối tượng orders
        this.iterator = orders.entrySet().iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Map.Entry<Food, Integer> next() {
        return iterator.next();
    }

    public void addOrder(Food food, int quantity) {
        // Kiểm tra nếu món ăn đã tồn tại trong đơn hàng
        if (orders.containsKey(food)) {
            orders.put(food, orders.get(food) + quantity); // Cập nhật số lượng nếu đã có món
        } else {
            orders.put(food, quantity); // Thêm mới nếu chưa có món
        }
        // Khởi tạo lại iterator để nó có thể duyệt qua các phần tử mới
        this.iterator = orders.entrySet().iterator();
    }

    public void removeOrder(Food food) {
        orders.remove(food);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Map.Entry<Food, Integer> entry : orders.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }
}
