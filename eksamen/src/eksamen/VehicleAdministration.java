package eksamen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class VehicleAdministration {

    private ArrayList<Car> cars;
    private HashMap<UUID, Bike> bikes;

    public VehicleAdministration() {
        cars = new ArrayList<>();
        bikes = new HashMap();
    }
    
    public void addCar(Car car){
        cars.add(car);
        System.out.println(car.getName() + " has been added to your inventory.");
    }
    
    public void removeCar(UUID id){
        Car toRemove = null;
        for(Car car : cars){
            if(car.getId().compareTo(id) == 0){
                toRemove = car;
            }
        }
        cars.remove(toRemove);
        System.out.println(toRemove.getName() + " has been removed from your inventory. ");
    }
    
    public void addBike(UUID id, Bike bike){
        bikes.put(id, bike);
        System.out.println(bike.getName() + " has been added to your inventory.");
    }
    
    public void removeBike(UUID id){   
        System.out.println("removing " + bikes.get(id).getName() + " " + bikes.get(id).getModel() + "...");
        bikes.remove(id);
        System.out.println("Removed succesfully!");
    }

}
