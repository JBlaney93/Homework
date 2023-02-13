import java.util.ArrayList;

public class FlightManager {

    // each bag weighs the same
    // 1/2 of total_weight is for bags
    //weight_of_bag_pp = total_weight_for_bags / 10

    private Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public int howMuchBaggagePerPassenger(){
        int weight = this.flight.getWeight() / 2;
        int capacity = this.flight.getCapacity();
        return weight / capacity;
    }


    public int totalBaggageBooked() {
        int bookedPassengers = this.flight.getPassengers().size();
        return bookedPassengers * 20;
    }

    public int getRemainingBaggageWeight() {
        int baggageBooked = this.totalBaggageBooked();
        int totalBaggage = this.flight.getWeight() / 2;
        return totalBaggage - baggageBooked;
    }
}
