import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember attendant;

    @Before
    public void setup(){
        attendant = new CabinCrewMember("Courtney", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void crewMemberHasName(){
        assertEquals("Courtney", attendant.getName());
    }

    @Test
    public void crewMemberHasRank(){
        assertEquals("Flight Attendant", attendant.getRank());
    }

    @Test
    public void crewMemberCanMakeAnnouncement(){assertEquals("Welcome to Blaney Airlines!", attendant.makeAnnouncement());}
}
