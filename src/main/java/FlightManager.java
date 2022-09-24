public class FlightManager extends Flight {

    Passenger passenger;

    public FlightManager(Pilot pilot, Plane plane, FlightInfo flightInfo, Passenger passenger) {
        super(pilot, plane, flightInfo);
        this.passenger = passenger;
    }

    public int getBaggageAllowancePerPerson(){
        return ((getPlane().getTotalWeight())/2)/getPlane().getCapacity();
    }

    public int getPlaneBaggageAllowance(){
        return ((getPlane().getTotalWeight())/2);
    }

    public int getBaggageWeightBooked(){
        return getBaggageAllowancePerPerson() * getPassengers();
    }
    public int getRemainingWeight(){
        return getPlaneBaggageAllowance() - getBaggageWeightBooked();
    }
}
