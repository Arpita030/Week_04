package unchecked_exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticExceptionDemoTest {

    @Test
    void testDivideByNonZero() {
        assertDoesNotThrow(() -> ArithmeticExceptionDemo.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        assertDoesNotThrow(() -> ArithmeticExceptionDemo.divide(10, 0));
    }
}
