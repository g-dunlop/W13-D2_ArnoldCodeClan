import components.Engine;
import components.GearBox;
import components.Tyre;
import customer.Customer;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;


    @Before
    public void before(){

        customer = new Customer(3000.00);
    }

    @Test
    public void hasMoney(){
        assertEquals(3000.00, customer.getMoney(), 0.0);
    }

    @Test
    public void hasNoCars(){
        assertEquals(0, customer.getNumberOfVehicles());
    }

    @Test
    public void canAddCar(){
        Tyre tyre = new Tyre("Michelin");
        GearBox gearBox = new GearBox(6);
        Engine engine = new Engine(120);
        Car car = new Car(engine, tyre, gearBox, "Ford", "Fiesta", "Blue", 4000.00, 3, "Petrol");
        customer.addCar(car);
        assertEquals(1, customer.getNumberOfVehicles());
    }

    @Test
    public void canBuyCar(){
        Tyre tyre = new Tyre("Michelin");
        GearBox gearBox = new GearBox(6);
        Engine engine = new Engine(120);
        Car car = new Car(engine, tyre, gearBox, "Ford", "Fiesta", "Blue", 2000.00, 3, "Petrol");
        customer.buyVehicle(car);
        assertEquals(1000.00, customer.getMoney(), 0.0);
        assertEquals(1, customer.getNumberOfVehicles());
    }

    @Test
    public void cantBuyCarIfPoor(){
        Tyre tyre = new Tyre("Michelin");
        GearBox gearBox = new GearBox(6);
        Engine engine = new Engine(120);
        Car car = new Car(engine, tyre, gearBox, "Ford", "Fiesta", "Blue", 4000.00, 3, "Petrol");
        customer.buyVehicle(car);
        assertEquals(3000.00, customer.getMoney(), 0.0);
        assertEquals(0, customer.getNumberOfVehicles());
    }
}
