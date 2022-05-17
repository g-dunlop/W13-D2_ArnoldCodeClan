import components.Engine;
import components.GearBox;
import components.Tyre;
import org.junit.Before;
import org.junit.Test;
import vehicles.Electric;
import vehicles.Hybrid;

import static org.junit.Assert.assertEquals;

public class ElectricTest {

    Electric electric;
    Tyre tyre;
    GearBox gearBox;
    Engine engine;

    @Before
    public void before(){
        tyre = new Tyre("Michelin");
        gearBox = new GearBox(6);
        engine = new Engine(120);
        electric = new Electric(engine, tyre, gearBox, "Ford", "Fiesta", "Blue", 4000.00, 3);
    }

    @Test
    public void canCharge(){
        assertEquals("charging while plugged in...", electric.charge());
    }
}

