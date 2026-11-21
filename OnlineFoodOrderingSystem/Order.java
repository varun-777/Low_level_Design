import java.util.*;

// ================= ORDER =================
/*
 * Association:
 * - Order HAS-A User
 * 
 * Aggregation:
 * - Order HAS-A List<FoodItem>
 * 
 * Also:
 * - implement total cost calculation
 */
public class Order {

    // TODO: private fields
    private String id;
    private User user;
    private List<FoodItem> items;

    // TODO: constructor
    public Order(String id, User user, List<FoodItem> items) {
        this.id = id;
        this.user = user;
        this.items = items;
    }

    // TODO: getters
    public String getid() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public List<FoodItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    // TODO: double getTotalCost

    public double getTotalCost() {
        double total = 0.0;
        for (FoodItem item : items) {
            total += item.quantity() * item.getprice();
        }
        return total;
    }
}