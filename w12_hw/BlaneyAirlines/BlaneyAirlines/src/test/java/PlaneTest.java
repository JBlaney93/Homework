import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    private Plane plane;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.BLANEY747);
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(10, plane.getCapacity());
    }

    @Test
    public void planeHasMaxWeight(){
        assertEquals(400, plane.getWeight());
    }
}
