package facade;

public class FoodDeliveryFacade {
    private RestaurantService restaurantService;
    private MenuService menuService;
    private OrderService orderService;
    private PaymentService paymentService;

    public FoodDeliveryFacade() {
        this.restaurantService = new RestaurantService();
        this.menuService = new MenuService();
        this.orderService = new OrderService();
        this.paymentService = new PaymentService();
    }

    public void showRestaurants() {
        restaurantService.showRestaurants();
    }

    public void orderFood(Food food, int numberOf) {
        menuService.showMenu(food.getName());
        orderService.placeOrder(food.getDesc());
        paymentService.makePayment(food.getPrize() * numberOf);
        System.out.println(food.getName() + " x " + numberOf + " ordered successfully");
    }
}
