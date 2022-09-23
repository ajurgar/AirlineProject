import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

CabinCrewMember cabinCrewMember;

        @Before
        public void before(){
            cabinCrewMember = new CabinCrewMember("Alex", Rank.Purser);
        }



        @Test
        public void hasName(){
            assertEquals("Alex", cabinCrewMember.getName());
        }

        @Test
        public void hasRank(){
            assertEquals(Rank.Purser, cabinCrewMember.getRank());
        }
}
