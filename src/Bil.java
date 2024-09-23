public class Bil {
    private String color;
    private double kilometers;
    private double price;
    private Driver driver;

    public Bil(String color, double kilometers, double price) {
        this.color = color;
        this.kilometers = kilometers;
        this.price = price;
    }

    public void drive(int numberOfKilomteres) {
        kilometers += numberOfKilomteres;
    }

    public double getPricePrice() {
        return this.price;
    }

    public String toString() {
        return "Color: " + color + ", Kilometers: " + kilometers + ", Price: " + price;
    }

    public boolean driverGetsIn(Driver a) {
        if(driver == null) {
            driver = a;
            return true;
        }
        return false;
    }

    public Driver whoDrives() {
        if(driver == null) {
            System.out.println("The car is empty");
        }
        return driver;
    }

    public String driverGetsOut() {
        if(driver == null) {
            return "The car is empty";
        }
       Driver b = driver;
       driver = null;
       return String.valueOf(b);
    }
}
