import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> destinations;
    private List<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.destinations = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    // Different Methods

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : destinations) {
            System.out.println("Destination: " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                System.out.println("- Activity: " + activity.getName() + ", Cost: $" +
                        activity.getCost() + ", Capacity: " + activity.getCapacity());
            }
        }
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        } else {
            System.out.println("Passenger capacity reached. Cannot add more passengers.");
        }
    }

    public void printPassengerList() {
        System.out.println("Travel Package: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println("- Passenger: " + passenger.getName() + ", Number: " +
                    passenger.getNumber());
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
}
