import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    Passenger passenger;
    CabinCrewMember cabinCrewMember;


    @Before
    public void before(){
        pilot = new Pilot("Mike", Rank.Captain, "8343");
        flight = new Flight(pilot, Plane.AIRCRAFT, FlightInfo.F2);
    }

    @Test
    public void getPilotName(){
        assertEquals("Mike", pilot.getName());
    }

    @Test
    public void canCheckNumPassengers(){
        assertEquals(0, flight.getPassengers());
    }
    @Test
    public void canCheckNumCabinCrewMember(){
        assertEquals(0, flight.getCabinCrewMembers());
    }

    @Test
    public void canCheckPlaneType(){
        assertEquals(Plane.AIRCRAFT, flight.getPlane());
    }

    @Test
    public void canCheckFlightInfo(){
        assertEquals(FlightInfo.F2, flight.getFlightInfo());
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengers());
    }

    @Test
    public void canAddCrewMember(){
        flight.addCrewMember(cabinCrewMember);
        assertEquals(1, flight.getCabinCrewMembers());

    }

}
