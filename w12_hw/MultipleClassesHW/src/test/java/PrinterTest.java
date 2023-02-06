import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    @Before
    public void before() {
       Printer printer = new Printer(20, 100);
    }
    // CAN'T GET THE BEFORE SETUP TO WORK???

    @Test
    public void paperCountStartsAt20() {
        Printer printer = new Printer(20, 100);
        assertEquals(20, printer.getPaperCount());
    }

    @Test
    public void printReducesPaperCount() {
        Printer printer = new Printer(20, 100);
        assertEquals(10, printer.print(2, 5));
    }

    @Test
    public void notEnoughPaperToPrintReturns0() {
        Printer printer = new Printer(5, 100);
        assertEquals(0, printer.print(10,10));
    }

    @Test
    public void tonerStartsAt100() {
        Printer printer = new Printer(20, 100);
        assertEquals(100, printer.getTonerCount());
    }

    @Test
    public void tonerReducedAfterPrint() {
        Printer printer = new Printer(20, 100);
        printer.print(2, 5);
        assertEquals(90, printer.getTonerCount());
    }
}
