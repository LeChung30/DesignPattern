package visitor;

public class Meal extends Food {
    private String name;
    private double price;

    public Meal(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void accept(IFoodVisitor visitor) {
        visitor.addOrder(this);
    }

    @Override
    public void absent(IFoodVisitor visitor) {
        visitor.removeOrder(this);
    }
}
