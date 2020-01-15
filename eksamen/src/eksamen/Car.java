package eksamen;

public class Car extends Vehicle {

    private int doors;
    private int wheels;
    private int milage;
    private String license;
    private String model;
    private int hp; 

    public Car(String name, String color, int doors, int wheels, int milage, String model, int hp) {
        super(name, color);
        this.doors = doors; 
        this.wheels = wheels; 
        this.milage = milage; 
        this.model = model; 
        this.hp = hp;
        this.license = createLicense();
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public int getMilage() {
        return milage;
    }

    public String getLicense() {
        return license;
    }

    public String getModel() {
        return model;
    }

    public int getHp() {
        return hp;
    }
    
    private String createLicense(){
        double random = Math.random()*2000;
        int number = (int) random;
        
        String license = String.valueOf(number) + " - " + "BLG";
        return license;
    }
    
    @Override
    public String toString(){
        String text = super.getName() + " " + this.model + ", Color: " + " " + super.getColor() + ", Wheels:" + " " + this.wheels + ", Milage: " + " " + this.milage + ", License: " + " " + this.license;
        return text;
    }
    

}
