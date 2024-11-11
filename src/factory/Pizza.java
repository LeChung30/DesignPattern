package factory;

public class Pizza extends Food {
    public Pizza() {
        super("Pizza", 5);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing pizza");
    }
}
