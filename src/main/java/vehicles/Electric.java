package vehicles;

import components.Engine;
import components.GearBox;
import components.Tyre;

public class Electric extends Vehicle {


    public Electric(Engine engine, Tyre tyre, GearBox gearBox, String make, String model, String color, double price, int doors) {
        super(engine, tyre, gearBox, make, model, color, price, doors);
    }

    public String charge(){
        return "charging while plugged in...";
    }
}
