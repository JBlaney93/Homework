import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void setup(){
        pilot = new Pilot("Jim", Rank.CAPTAIN, "100");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Jim", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals("Captain", pilot.getRank());
    }

    @Test
    public void pilotHasLicence(){
        assertEquals("100", pilot.getLicenceNum());
    }
}
