package vehicles;

import components.Engine;
import components.GearBox;
import components.Tyre;

public class Hybrid extends Car {



    public Hybrid(Engine engine, Tyre tyre, GearBox gearBox, String make, String model, String color, double price, int doors, String fueltype) {
        super(engine, tyre, gearBox, make, model, color, price, doors, fueltype);
    }

    public String charge(){
        return "charging while driving...";
    }
}
