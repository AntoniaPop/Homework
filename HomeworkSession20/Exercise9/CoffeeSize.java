//Create an enum CoffeeSize with sizes and attributes like volume and price.
// Implement a method to calculate the cost of an order.

package Exercise9;

public enum CoffeeSize {
    SMALL(150, 1.50),
    MEDIUM (250, 2.50 ),
    LARGE(500, 4.50);

    private final int size;
    private final double price;

    CoffeeSize(int size, double price) {
        this.size = size;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public double calculateOrder(int quantity){
        return quantity * price;

    }


}
