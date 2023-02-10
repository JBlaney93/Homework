import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RankTest {

    @Test
    public void captainHasRankOfCaptain(){
        assertEquals("Captain", Rank.CAPTAIN.getRank());
    }

    @Test
    public void firstOfficerHasRankOfFirstOfficer(){
        assertEquals("First Officer", Rank.FIRST_OFFICER.getRank());
    }

    @Test
    public void flightAttendantHasRankOfFlightAttendant(){
        assertEquals("Flight Attendant", Rank.FLIGHT_ATTENDANT.getRank());
    }
}
