package factory;

public class Burger extends Food {
    public Burger() {
        super("Burger", 3);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing burger");
    }
}
