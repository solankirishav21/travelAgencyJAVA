import java.util.List;
import java.util.ArrayList;

public class Destination {
    private String name;
    private List<Activity> activities;

    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
}
