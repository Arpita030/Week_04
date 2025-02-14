package throw_vs_throws;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class CalculateInterestTest {

    @Test
    void testValidInterestCalculation() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        CalculateInterest.calculateInterest(1000, 5, 2);

        String output = outputStream.toString();
        assertTrue(output.contains("Interest :100.0"));
    }

    @Test
    void testNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CalculateInterest.calculateInterest(-1000, 5, 2);
        });

        assertEquals("Invalid input: Amount and rate must be positive", exception.getMessage());
    }

    @Test
    void testNegativeRate() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CalculateInterest.calculateInterest(1000, -5, 2);
        });

        assertEquals("Invalid input: Amount and rate must be positive", exception.getMessage());
    }
}
