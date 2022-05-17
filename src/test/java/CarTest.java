import components.Engine;
import components.GearBox;
import components.Tyre;
import org.junit.Before;
import vehicles.Car;

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
}
