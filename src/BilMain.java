import java.util.ArrayList;

public class BilMain {
    public static void main(String[] args) {
        Bil car1 = new Bil("Red", 100.1,9889);
        Bil car2 = new Bil("Blue", 100.1,9889);
        Bil car3 = new Bil("Green", 100.1,9889);
        Driver driver1 = new Driver("Bob");
        Driver driver2 = new Driver("Alice");
        Garage garage = new Garage();
        garage.addCar(car1);
        garage.addCar(car2);
        garage.addCar(car3);
        garage.priceForAllCars();
        garage.clearGarage();
        garage.printGarage();

        /*car1.driverGetsIn(driver1);
        System.out.println(car1.whoDrives());

        car1.driverGetsIn(driver2);
        System.out.println(car1.whoDrives());

        System.out.println(car1.driverGetsOut());
        System.out.println(car1.driverGetsOut());

        car1.driverGetsIn(driver2);
        System.out.println(car1.whoDrives());*/

    }
}
