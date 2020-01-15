
package eksamen;

import java.util.UUID;

public abstract class Vehicle {
    
   private UUID id; 
   private String name; 
   private String color; 
    
    
    
    public Vehicle(String name, String color){
        this.name = name;
        this.color = color;
        id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public UUID getId() {
        return id;
    }
    
    
    
}
