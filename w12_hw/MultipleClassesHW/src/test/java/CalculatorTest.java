import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void addThreeAndThree() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.add(3, 3));
    }

    @Test
    public void subtractTenMinusFive() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    public void multiplyFiveByFive() {
        Calculator calc = new Calculator();
        assertEquals(25, calc.multiply(5, 5));
    }

    @Test
    public void divideTenByTwo() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.divide(10, 2), 0.0);
    }

}
