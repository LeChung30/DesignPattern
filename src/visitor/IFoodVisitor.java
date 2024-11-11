package visitor;

public interface IFoodVisitor {
    void addOrder(Drink drink);
    void addOrder(Eggs eggs);
    void addOrder(Meal meal);
    void addOrder(Vegetables vegetables);
    void removeOrder(Drink drink);
    void removeOrder(Eggs eggs);
    void removeOrder(Meal meal);
    void removeOrder(Vegetables vegetables);
    void takeSale(Drink drink, double discount);
    void takeSale(Eggs eggs, double discount);
    void takeSale(Meal meal, double discount);
    void takeSale(Vegetables vegetables, double discount);
}
