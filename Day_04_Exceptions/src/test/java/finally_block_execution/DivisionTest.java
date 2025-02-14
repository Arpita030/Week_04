package finally_block_execution;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void testValidDivision() {
        assertDoesNotThrow(() -> Divison.division(10, 2));
    }

    @Test
    void testDivisionByZero() {
        assertDoesNotThrow(() -> Divison.division(10, 0));
    }
}
