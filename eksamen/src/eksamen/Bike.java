package eksamen;

public class Bike extends Vehicle implements Buyable {

    private int wheels;
    private boolean lights;
    private boolean electric;
    private String model;
    private String size;
    private boolean bought;

    public Bike(String name, String color, int wheels, boolean lights, boolean electric, String model, String size) {
        super(name, color);
        this.wheels = wheels;
        this.lights = lights;
        this.electric = electric;
        this.model = model;
        this.size = size;
        this.bought = false;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isLights() {
        return lights;
    }

    public boolean isElectric() {
        return electric;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public boolean isBought() {
        return bought;
    }

    @Override
    public void buy() {
        if (bought) {
            System.out.println("Sorry... This has been sold.");
        } else {
            System.out.println("congratulations with your new bike...");
            bought = true;
        }
    }

    @Override
    public void refund() {
        if (bought) {
            System.out.println("I'm sorry it didn't fit, have a look for another one.");
            bought = false;
        } else {
            System.out.println("You can't refund a bike you don't own..");
        }
    }

    @Override
    public String toString() {
        String text = super.getName() + " " + this.model + ", Color: " + super.getColor() + ", Wheels: " + this.wheels + ", Electric: " +  this.electric + ", Lights: " + this.lights + ", Size: " + this.size;
        return text;
    }

}
