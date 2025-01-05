package Exercise9;


public class Main {
    public static void main(String[] args) {


        CoffeeSize size = CoffeeSize.MEDIUM;
        int quantity = 3;
        double totalCost = size.calculateOrder(quantity);

        System.out.println("You ordered " + quantity + " " + size + " cofee(s).");
        System.out.println("Total cost: " + totalCost);

        size = CoffeeSize.LARGE;
        quantity = 4;
        totalCost = size.calculateOrder(quantity);

        System.out.println("You ordered " + quantity + " " + size + " cofee(s)");
        System.out.println("Total cost: " + totalCost);
    }
}
