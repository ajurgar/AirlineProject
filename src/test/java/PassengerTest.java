import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Michael", 2);
    }

    @Test
    public void hasAName(){
        assertEquals("Michael", passenger.getName());
    }
    @Test
    public void hasNumOfBags(){
        assertEquals(2, passenger.getNumOfBags());
    }
    @Test
    public void canChangeName(){
        passenger.setName("Pep");
        assertEquals("Pep", passenger.getName());
    }

}
