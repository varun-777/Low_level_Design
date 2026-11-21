import java.util.*;

// ================= SERVICE =================
public class OrderService {

    private int counter = 1;

    /*
     * Create order:
     * - generate id ORD1, ORD2...
     * - assign to user
     */
    Order createOrder(User user, List<FoodItem> items) {
        // TODO
        Order order = new Order("ORD" + (counter++), user, items);
        user.addOrder(order);
        return order;
    }
}