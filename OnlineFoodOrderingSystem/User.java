import java.util.*;

// ================= USER =================
/*
Encapsulation:
- id must be private
- user can have multiple orders (association)
*/
public class User {

    // TODO: private fields
    private String id;
    private List<Order> orders;

    // TODO: constructor
    public User(String name) {
        this.id = name;
        this.orders = new ArrayList<>();
    }

    // TODO: getter
    public String getuserid() {
        return id;
    }

    public List<Order> getOrders() {
        return orders;
    }

    // TODO: addOrder(Order o)
    public void addOrder(Order o) {
        orders.add(o);
    }
}