import java.util.*;

// ================= MAIN =================
public class Main {
    public static void main(String[] args) {

        User user = new User("U1");

        List<FoodItem> items = new ArrayList<>();
        items.add(new FoodItem("Pizza", 100, 2));
        items.add(new FoodItem("Burger", 50, 1));

        OrderService service = new OrderService();
        Order order = service.createOrder(user, items);

        System.out.println(order.getTotalCost());
    }
}
