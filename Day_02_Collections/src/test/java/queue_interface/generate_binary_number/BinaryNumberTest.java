package queue_interface.generate_binary_number;

import org.junit.jupiter.api.Test;
import queue_interface.generate_binary_number_using_queue.BinaryNumber;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class BinaryNumberTest {

    @Test
    void testGenerateBinaryNumbers() {
        List<String> binaryNumbers = BinaryNumber.generateBinaryNumbers(5);

        // Expected output for N = 5: ["1", "10", "11", "100", "101"]
        assertEquals(5, binaryNumbers.size());
        assertEquals("1", binaryNumbers.get(0));
        assertEquals("10", binaryNumbers.get(1));
        assertEquals("11", binaryNumbers.get(2));
        assertEquals("100", binaryNumbers.get(3));
        assertEquals("101", binaryNumbers.get(4));
    }

    @Test
    void testGenerateBinaryNumbersZero() {
        List<String> binaryNumbers = BinaryNumber.generateBinaryNumbers(0);
        assertTrue(binaryNumbers.isEmpty());
    }

    @Test
    void testGenerateBinaryNumbersOne() {
        List<String> binaryNumbers = BinaryNumber.generateBinaryNumbers(1);
        assertEquals(1, binaryNumbers.size());
        assertEquals("1", binaryNumbers.get(0));
    }
}
