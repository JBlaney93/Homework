import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTypeTest {

    @Test
    public void planeHasCapacity(){
        assertEquals(10, PlaneType.BLANEY747.getCapacity());
    }

    @Test
    public void planeHasMaxWeight(){
        assertEquals(400, PlaneType.BLANEY747.getWeight());
    }


}
