import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Bus bus;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("The Castle");
        bus = new Bus ("Edinburgh", 25);
        person = new Person();
    }

    @Test
    public void canCountPassengersInQueue(){
        assertEquals(0, busStop.passengersInQueue());
    }

    @Test
    public void canAddPerson(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.passengersInQueue());
    }

    @Test
    public void canRemovePerson(){
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(0, busStop.passengersInQueue());
    }


}
