package vehicles;

import behaviour.IDrive;
import components.Engine;
import components.GearBox;
import components.Tyre;

public abstract class Vehicle implements IDrive {

    private Engine engine;
    private Tyre tyre;
    private GearBox gearBox;
    private String make;
    private String model;
    private String color;
    private double price;
    private int doors;

    public Vehicle(Engine engine, Tyre tyre, GearBox gearBox, String make, String model, String color, double price, int doors) {
        this.engine = engine;
        this.tyre = tyre;
        this.gearBox = gearBox;
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
        this.doors = doors;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getDoors() {
        return doors;
    }
}
