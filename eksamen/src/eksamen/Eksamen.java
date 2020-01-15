package eksamen;

import java.util.UUID;

public class Eksamen {

    public static void main(String[] args) {

        Car opel_kaskett = new Car("Opel", "sort", 2, 4, 198236, "kaskett", 99);
        Car opel_kaskett2 = new Car("Ford", "blå", 2, 4, 198236, "kaskett", 99);
        Car opel_kaskett3 = new Car("Lamborghini", "lilla", 2, 4, 198236, "kaskett", 99);
        Bike bike = new Bike("Trek", "Black-Grey", 2, true, true, "MTB-8000", "Small");
        Bike bike1 = new Bike("Super", "Red-Blue", 2, false, false, "Racer-1", "Medium");
        Bike bike2 = new Bike("Everness", "Yellow-Grey", 2, false, true, "City-999", "XLarge");

        VehicleAdministration va  = new VehicleAdministration();

        va.addCar(opel_kaskett);
        va.addCar(opel_kaskett2);
        va.addCar(opel_kaskett3);
        va.removeCar(opel_kaskett.getId());

        va.addBike(bike.getId(), bike);
        va.addBike(bike1.getId(), bike1);
        va.addBike(bike2.getId(), bike2);

        System.out.println(opel_kaskett.toString());
        System.out.println(bike.toString());
        System.out.println(bike2.toString());

        va.removeBike(bike.getId());

    }

}
