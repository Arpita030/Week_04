package Map_interface.map_merger_4;

import Map_Interface.map_merger.MapMerger;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class MapMergerTest {

    @Test
    void testMergeMapsWithCommonKeys() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> mergedMap = MapMerger.mergeMaps(map1, map2);

        assertEquals(1, mergedMap.get("A"));  // A remains the same
        assertEquals(5, mergedMap.get("B"));  // B is summed (2+3)
        assertEquals(4, mergedMap.get("C"));  // C is added from map2
    }

    @Test
    void testMergeMapsWithNoCommonKeys() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("X", 10);
        map1.put("Y", 20);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Z", 30);
        map2.put("W", 40);

        Map<String, Integer> mergedMap = MapMerger.mergeMaps(map1, map2);

        assertEquals(10, mergedMap.get("X"));
        assertEquals(20, mergedMap.get("Y"));
        assertEquals(30, mergedMap.get("Z"));
        assertEquals(40, mergedMap.get("W"));
    }

    @Test
    void testMergeMapsWithEmptyMap() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 5);
        map1.put("B", 10);

        Map<String, Integer> map2 = new HashMap<>();

        Map<String, Integer> mergedMap = MapMerger.mergeMaps(map1, map2);

        assertEquals(5, mergedMap.get("A"));
        assertEquals(10, mergedMap.get("B"));
    }

    @Test
    void testMergeMapsWithBothEmpty() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        Map<String, Integer> mergedMap = MapMerger.mergeMaps(map1, map2);

        assertTrue(mergedMap.isEmpty());
    }
}
