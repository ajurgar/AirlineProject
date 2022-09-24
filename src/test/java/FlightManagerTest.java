import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {


    FlightManager flightManager;
    Pilot pilot;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        passenger1 = new Passenger("John", 1);
        passenger2 = new Passenger("Will", 2);
        passenger3 = new Passenger("Kevin", 2);
        pilot = new Pilot("Steve",Rank.Captain, "43435");
        flightManager = new FlightManager(pilot, Plane.BOING747, FlightInfo.F3, passenger1);
    }

    @Test
    public void canCheckBaggageAllowance(){
        assertEquals(10, flightManager.getBaggageAllowancePerPerson());
    }

    @Test
    public void canCheckBookedBaggageWeightOfPassengers(){
        flightManager.bookAPassenger(passenger1);
        flightManager.bookAPassenger(passenger2);
        flightManager.bookAPassenger(passenger3);
        assertEquals(30, flightManager.getBaggageWeightBooked());
    }

    @Test
    public void canCheckRemainingWeightToBeBooked(){
        flightManager.bookAPassenger(passenger1);
        flightManager.bookAPassenger(passenger2);
        flightManager.bookAPassenger(passenger3);
        assertEquals(470, flightManager.getRemainingWeight());
    }
}
