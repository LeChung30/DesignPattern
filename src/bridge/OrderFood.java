package bridge;

public class OrderFood extends Food {

    public OrderFood(IFood iFood) {
        super(iFood);
    }

    @Override
    public void details(int quantity) {
        System.out.println("Name: " + getiFood().getName() + ", quantity: " + quantity);
        System.out.println("Price: " + getiFood().calculatePrize(quantity));
    }
}
