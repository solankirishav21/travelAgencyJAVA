import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String name;
    private int passengerNumber;
    private String passengerType;
    private double balance;
    private List<Activity> activities;

    public Passenger(String name, int number, String type, double balance) {
        this.name = name;
        this.passengerNumber = number;
        this.passengerType = type;
        this.balance = balance;
        this.activities = new ArrayList<>();
    }

    // Printing Passenger Details

    public void printDetails() {
        System.out.println("Passenger Name: " + name);
        System.out.println("Passenger Number: " + passengerNumber);
        System.out.println("Passenger Type: " + passengerType);
        if (!passengerType.equals("Premium")) {
            System.out.println("Balance: $" + balance);
        }
        System.out.println("Activities Signed Up For:");
        for (Activity activity : activities) {
            System.out.println("- " + activity.getName() + " at " + activity.getName() +
                    " (Price: $" + activity.getCost() + ")");
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getNumber() {
        return passengerNumber;
    }

    public String getType() {
        return passengerType;
    }

    public double getBalance() {
        return balance;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.passengerNumber = number;
    }

    public void setType(String type) {
        this.passengerType = type;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
}
