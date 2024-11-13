package bridge;

public class BaseFood implements IFood {
    private String name;
    private double price;

    public BaseFood(String name, double price) {
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
    public double calculatePrize(int quantity) {
        return quantity * price;
    }
}
