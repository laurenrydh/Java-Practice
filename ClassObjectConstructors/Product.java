package ClassObjectConstructors;

public class Product {
    private double cost;
    private int quantity;
    private String name;


    // Constructor
    public Product(double cost, int quantity, String name) {
        this.cost = cost;
        this.quantity = quantity;
        this.name = name;
    }

    public void totalCost() {
        double total = cost * quantity;
        System.out.println("Total cost is: " + total);
    }

    public void printProduct() {
        System.out.println(name + " costs " + cost + " and " + quantity + " units were purchased.");
    }

    public static void main(String[] args) {
        Product fruit1 = new Product(3, 75, "Pomegranates");
        
        fruit1.printProduct();
        fruit1.totalCost();
        
    }

}
