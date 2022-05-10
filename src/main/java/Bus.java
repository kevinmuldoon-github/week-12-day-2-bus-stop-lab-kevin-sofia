import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }


    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int numberOfPassengers(){
        return passengers.size();
    }

    public void addPerson(Person person){

        if(numberOfPassengers() < capacity) {
            passengers.add(person);
        } // end if
    }

    public void removePassenger(Person person){
        passengers.remove(person);
    }

    public void pickUpPassenger(BusStop busStop) {
        Person person = busStop.removePersonFromQueue();
        addPerson(person);
    }
}
