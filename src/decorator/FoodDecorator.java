package decorator;

public class FoodDecorator implements IFood {
    private IFood food;

    public FoodDecorator(IFood food) {
        this.food = food;
    }

    @Override
    public String getName() {
        return this.food.getName();
    }

    @Override
    public double getPrice() {
        return this.food.getPrice();
    }
}
