package custom_exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AgeValidatorTest {

    @Test
    void testValidAge() {
        assertDoesNotThrow(() -> AgeValidator.validateAge(18));
    }

    @Test
    void testInvalidAge() {
        Exception exception = assertThrows(InvalidAgeException.class, () -> AgeValidator.validateAge(17));
        assertEquals("Age must be 18 or above ", exception.getMessage());
    }
}
