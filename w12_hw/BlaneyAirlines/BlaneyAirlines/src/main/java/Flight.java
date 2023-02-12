import java.util.ArrayList;

public class Flight {

    private ArrayList<CabinCrewMember> crew;
    private ArrayList<Passenger> passengers;
    private Pilot pilot;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String origin;
    private String time;

    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String origin, String time){
        this.pilot = pilot;
        this.plane = plane;
        crew = new ArrayList<>();
        passengers = new ArrayList<>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.origin = origin;
        this.time = time;
    }

    public String getPilot() {
        return pilot.getName();
    }


    public void addPassenger(Passenger passenger, ArrayList<Passenger> passengers) {
        passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger, ArrayList<Passenger> passengers) {
        passengers.remove(passenger);
    }

    public void addCrewMember(CabinCrewMember crewMember, ArrayList<CabinCrewMember> crew) {
        crew.add(crewMember);
    }

    public void removeCrewMember(CabinCrewMember crewMember, ArrayList<CabinCrewMember> crew) {
        crew.remove(crewMember);
    }

    public int getRemainingSeats(Plane plane, ArrayList<Passenger> passengers) {
        return plane.getCapacity() - passengers.size();
    }

    public void bookPassenger(Plane plane, ArrayList<Passenger> passengers, Passenger passenger){
        int remainingSeats = getRemainingSeats(plane, passengers);
        if (remainingSeats > 0) {
            addPassenger(passenger, passengers);
        }
    }


    public int getWeight(){
        return this.plane.getWeight();
    }
    public int getCapacity(){
        return this.plane.getCapacity();
    }


    public ArrayList getPassengers() {
        return this.passengers;
    }
}
