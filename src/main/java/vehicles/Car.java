package vehicles;

import components.Engine;
import components.GearBox;
import components.Tyre;

public class Car extends Vehicle {

    private String fuelType;

    public Car(Engine engine, Tyre tyre, GearBox gearBox, String make, String model, String color, double price, int doors, String fuelType) {
        super(engine, tyre, gearBox, make, model, color, price, doors);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }
}
