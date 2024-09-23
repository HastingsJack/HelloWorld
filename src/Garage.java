import java.util.ArrayList;

public class Garage {
    private ArrayList<Bil> cars;

    public Garage() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Bil car) {
        cars.add(car);
    }

    public void priceForAllCars() {
        int totalPrice = 0;
        for (Bil car : cars) {
            totalPrice += car.getPricePrice();
        }
        System.out.println(totalPrice);
    }

    public void printGarage() {
        for(Bil car : cars) {
            System.out.println(car);
        }
    }

    public void clearGarage() {
        cars.clear();
    }
}
