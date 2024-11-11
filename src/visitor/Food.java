package visitor;

public abstract class Food {
    public abstract void accept(IFoodVisitor visitor);
    public abstract void absent(IFoodVisitor visitor);
}
