package Inkøbskurv;

public class Vare {
    private String name;
    private double price;

    public Vare(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name.substring(0,1).toUpperCase() + name.substring(1) +
                " are " + price + " kr.";
    }
}
