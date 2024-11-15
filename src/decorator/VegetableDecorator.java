package decorator;

public class VegetableDecorator extends FoodDecorator {
    private String name;
    private double price;

    public VegetableDecorator(IFood food, String name, double price) {
        super(food);
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return super.getName() + ", " + this.name;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.price;
    }
}
