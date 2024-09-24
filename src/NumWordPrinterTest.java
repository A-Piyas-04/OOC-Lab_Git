import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumWordPrinterTest {

    NumWordPrinter printer = new NumWordPrinter();


    @Test
    public void testDivisibleBy2() {
        assertEquals("Even", printer.printWord(4, false));
    }

}

