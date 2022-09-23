import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private FlightInfo flightInfo;

    public Flight(Pilot pilot, Plane plane, FlightInfo flightInfo) {
        this.pilot = pilot;
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightInfo = flightInfo;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public int getCabinCrewMembers() {
        return cabinCrewMembers.size();
    }

    public int getPassengers() {
        return passengers.size();
    }


    public Plane getPlane() {
        return plane;
    }


    public FlightInfo getFlightInfo() {
        return flightInfo;
    }


    public void addCrewMember(CabinCrewMember cabinCrewMember){
        cabinCrewMembers.add(cabinCrewMember);
    }

    public int getAvailableSeats(){
        return getPlane().getCapacity()-getPassengers();
    }

    public void bookAPassenger(Passenger passenger){
        if(getAvailableSeats() >0) {
            passengers.add(passenger);
        }
    }


}
