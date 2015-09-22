package mx.iteso;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Test.*;

public class TacitKnowledgePrinterTest {

    Printer printer = mock(Printer.class);
    TacitKnowledgePrinter tkPrinter = new TacitKnowledgePrinter(printer);

    public void TestPrinter()
    {

        tkPrinter.printNumbers(10);
        verify(printer, times(10)).print(anyString());

    }

    @Test(expected=RuntimeException.class)
    public void testRuntimeException()
    {
        tkPrinter.printNumbers(0);
    }

    // Test printNumbers with a limit of 10
    // Verify print() being called 10 times
    // Verify expected result

    //Test printNumbers with a limit of 0
    //Verify Exception

    //What else can we test?
    //What should we verify?
}
