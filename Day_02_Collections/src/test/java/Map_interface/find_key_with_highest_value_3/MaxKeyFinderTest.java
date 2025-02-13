package Map_interface.find_key_with_highest_value_3;

import Map_Interface.Key_with_highestvalue.MaxKeyFinder;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class MaxKeyFinderTest {

    @Test
    void testFindMaxKey() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        String result = MaxKeyFinder.findMaxKey(inputMap);
        assertEquals("B", result);
    }

    @Test
    void testFindMaxKeyWithSingleEntry() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("X", 5);

        String result = MaxKeyFinder.findMaxKey(inputMap);
        assertEquals("X", result);
    }

    @Test
    void testFindMaxKeyWithEmptyMap() {
        Map<String, Integer> inputMap = new HashMap<>();

        String result = MaxKeyFinder.findMaxKey(inputMap);
        assertNull(result);
    }

    @Test
    void testFindMaxKeyWithNegativeValues() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("P", -10);
        inputMap.put("Q", -5);
        inputMap.put("R", -20);

        String result = MaxKeyFinder.findMaxKey(inputMap);
        assertEquals("Q", result);
    }
}
