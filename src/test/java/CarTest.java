import components.Engine;
import components.GearBox;
import components.Tyre;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;
    Tyre tyre;
    GearBox gearBox;


    @Before
    public void before(){
        tyre = new Tyre("Michelin");
        gearBox = new GearBox(6);
        engine = new Engine(120);
        car = new Car(engine, tyre, gearBox, "Ford", "Fiesta", "Blue", 4000.00, 3, "Petrol");
    }

    @Test
    public void hasTyre(){
        assertEquals("Michelin", car.getTyre().getBrand());
    }

    @Test
    public void hasGearBox(){
        assertEquals(6, car.getGearBox().getNumberOfGears());
    }

    @Test
    public void hasEngine(){
        assertEquals(120, car.getEngine().getBhp());
    }

    @Test
    public void hasMakeModelColor(){
        assertEquals("Ford", car.getMake());
        assertEquals("Fiesta", car.getModel());
        assertEquals("Blue", car.getColor());
    }

    @Test
    public void priceDoorsFuelType(){
        assertEquals(4000.00, car.getPrice(),0.0);
        assertEquals(3, car.getDoors());
        assertEquals("Petrol", car.getFuelType());
    }


}
