/*
 * Encapsulation:
 * - name, price, quantity must be private
 */
public class FoodItem {

    // TODO: private fields
    private String name;
    private double price;
    private int quantity;

    // TODO: constructor
    public FoodItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getname() {
        return name;
    }

    public double getprice() {
        return price;
    }

    public int quantity() {
        return quantity;
    }
}
