import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("The Castle");
        bus = new Bus ("Edinburgh", 25);
        person = new Person();
    }

    @Test
    public void busHasDestination(){
        assertEquals("Edinburgh", bus.getDestination());
    }

    @Test
    public void busHasCapacity(){
        assertEquals(25, bus.getCapacity());
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.numberOfPassengers());
    }

    @Test
    public void canAddPassenger(){
        bus.addPerson(person);
        assertEquals(1, bus.numberOfPassengers());
    }

    @Test
    public void cannotAddPassenger(){
        bus.setCapacity(0);
        bus.addPerson(person);
        assertEquals(0, bus.numberOfPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPerson(person);
        bus.removePassenger(person);
        assertEquals(0, bus.numberOfPassengers());
    }

    @Test
    public void canPickUpPassenger(){
        busStop.addPersonToQueue(person);
        bus.pickUpPassenger(busStop);
        assertEquals(1, bus.numberOfPassengers());
        assertEquals(0, busStop.passengersInQueue());
    }

}
