import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Steve", Rank.Captain, "3994C");
    }

    @Test
    public void hasName(){
        assertEquals("Steve", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.Captain, pilot.getRank());
    }

    @Test
    public void hasLicenseNumber(){
        assertEquals("3994C", pilot.getLicenseNumber());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("I believe I can Fly!!!", pilot.flyPlane());
    }
}
