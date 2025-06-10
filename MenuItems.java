public class MenuItems {
    // Instance variables
    private String name;
    private int purchases;
    private double price;
    
    // Default Constructor
    public MenuItems() {
        this.name = "Unknown";
        this.purchases = 0;
        this.price = 0.0;
    }

    // Parameterised Constructor
    public MenuItems(String name, int purchases, double price) {
        this.name = name;
        this.purchases = 0;
        this.price = 0.0;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPurchases(int purchases) {
        this.purchases = purchases;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPurchases() {
        return purchases;
    }

    public double getPrice() {
        return price;
    }
}

