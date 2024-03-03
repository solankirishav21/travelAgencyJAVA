import org.junit.Test;
import static org.junit.Assert.*;

public class TravelPackageTest {

    @Test
    public void testAddDestination() {
        TravelPackage travelPackage = new TravelPackage("Europe Tour", 50);
        Destination destination = new Destination("Paris");
        travelPackage.addDestination(destination);
        assertEquals(1, travelPackage.getDestinations().size());
    }

    // Add more test cases...
}
