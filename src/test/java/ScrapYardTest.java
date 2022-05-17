import Dealerships.ScrapYard;
import components.Engine;
import components.GearBox;
import components.Tyre;
import customer.Customer;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class ScrapYardTest {

    ScrapYard scrapYard;

    @Before
    public void before(){
        scrapYard = new ScrapYard(5000.00);
    }

    @Test
    public void hasTill(){
        assertEquals(5000.00, scrapYard.getTill(), 0.0);
    }

    @Test
    public void hasNoCars(){
        assertEquals(0, scrapYard.vehicleCount());
    }

    @Test
    public void canAddMoneyToTill(){
        scrapYard.addMoney(10);
        assertEquals(5010.00, scrapYard.getTill(), 0.0);
    }

    @Test
    public void canRemoveVehicle(){
        Tyre tyre = new Tyre("Michelin");
        GearBox gearBox = new GearBox(6);
        Engine engine = new Engine(120);
        Car car = new Car(engine, tyre, gearBox, "Ford", "Fiesta", "Blue", 4000.00, 3, "Petrol");
        scrapYard.addVehicle(car);
        scrapYard.removeVehicle(car);
        assertEquals(0, scrapYard.vehicleCount());
    }

    @Test
    public void canAddVehicle(){
        Tyre tyre = new Tyre("Michelin");
        GearBox gearBox = new GearBox(6);
        Engine engine = new Engine(120);
        Car car = new Car(engine, tyre, gearBox, "Ford", "Fiesta", "Blue", 4000.00, 3, "Petrol");
        scrapYard.addVehicle(car);
        assertEquals(1, scrapYard.vehicleCount());
    }

    @Test
    public void canSellVehicle(){
        Tyre tyre = new Tyre("Michelin");
        GearBox gearBox = new GearBox(6);
        Engine engine = new Engine(120);
        Car car = new Car(engine, tyre, gearBox, "Ford", "Fiesta", "Blue", 4000.00, 3, "Petrol");
        scrapYard.addVehicle(car);
        Customer customer = new Customer(5000.00);
        scrapYard.sellVehicle(car, customer);
        assertEquals(0, scrapYard.vehicleCount());
        assertEquals(9000.00, scrapYard.getTill(), 0.0);
    }
}
