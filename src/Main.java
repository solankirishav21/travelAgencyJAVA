
public class Main {
    public static void main(String[] args) {
        // Create a travel package
        TravelPackage europeTour = new TravelPackage("Europe Tour", 50);

        // Create destinations
        Destination paris = new Destination("Paris");
        Destination rome = new Destination("Rome");

        // Add activities to destinations
        Activity eiffelTowerTour = new Activity("Eiffel Tower Tour", "Guided tour of Eiffel Tower", 25.0, 30);
        paris.addActivity(eiffelTowerTour);

        Activity colosseumVisit = new Activity("Colosseum Visit", "Visit to the ancient Colosseum", 20.0, 40);
        rome.addActivity(colosseumVisit);

        // Add destinations to travel package
        europeTour.addDestination(paris);
        europeTour.addDestination(rome);

        // Print itinerary
        europeTour.printItinerary();

        // Create passengers
        Passenger passenger1 = new Passenger("Ravi", 1, "Standard", 100000);
        Passenger passenger2 = new Passenger("Preeti", 2, "Gold", 150000);

        // Add passengers to travel package
        europeTour.addPassenger(passenger1);
        europeTour.addPassenger(passenger2);

        // Print passenger list
        europeTour.printPassengerList();

        // Print details of individual passenger
        System.out.println("\nDetails of Passenger 1:");
        passenger1.printDetails();

        // Print available activities
        System.out.println("\nAvailable Activities:");
        for (Destination destination : europeTour.getDestinations()) {
            for (Activity activity : destination.getActivities()) {
                if (activity.getPassengers().size() < activity.getCapacity()) {
                    System.out.println(activity.getName() + " at " + destination.getName() +
                            " - Cost: ₹" + activity.getCost() + ", Capacity: " +
                            (activity.getCapacity() - activity.getPassengers().size()) + " spaces available");
                }
            }
        }
    }
}
