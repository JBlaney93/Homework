import management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jim", 101, 30000, "finance");
    }

    @Test
    public void getSalary(){
        assertEquals(30000, manager.getSalary(), 0.1);
    }
}
