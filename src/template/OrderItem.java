package template;

public class OrderItem extends FoodItem {
    private Food food;

    public OrderItem(int quantity, Food food) {
        super(quantity);
        this.food = food;
    }

    @Override
    public void prepareIngredients() {
        System.out.println("Preparing ingredients for " + getQuantity() + " " + this.food.getName());
    }

    @Override
    public void cook() {
        System.out.println("Cooking " + getQuantity() + " " + this.food.getName());
    }

    @Override
    public void pack() {
        System.out.println("Packing " + getQuantity() + " " + this.food.getName());
    }

    @Override
    public void serve() {
        System.out.println("Serving " + getQuantity() + " " + this.food.getName() + " for $" + this.food.getPrice());
    }
}
