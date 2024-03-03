import java.util.List;

public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private List<Passenger> passengers;

    public Activity(String name, String description, double cost, int capacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        // Initialize passengers list as needed
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
}
