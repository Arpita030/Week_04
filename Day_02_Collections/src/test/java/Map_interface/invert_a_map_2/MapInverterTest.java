package Map_interface.invert_a_map_2;
import Map_Interface.invert_a_map.MapInverter;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class MapInverterTest {

    @Test
    void testInvertMap() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);
        inputMap.put("D", 3);
        inputMap.put("E", 2);

        Map<Integer, List<String>> expectedOutput = new HashMap<>();
        expectedOutput.put(1, Arrays.asList("A", "C"));
        expectedOutput.put(2, Arrays.asList("B", "E"));
        expectedOutput.put(3, Collections.singletonList("D"));

        Map<Integer, List<String>> actualOutput = MapInverter.invertMap(inputMap);

        assertEquals(expectedOutput.keySet(), actualOutput.keySet());

        for (Integer key : expectedOutput.keySet()) {
            List<String> expectedList = expectedOutput.get(key);
            List<String> actualList = actualOutput.get(key);
            assertNotNull(actualList);
            assertTrue(actualList.containsAll(expectedList) && expectedList.containsAll(actualList));
        }
    }
}
