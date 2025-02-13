package list_interface.find_frequency_of_element_02;
import list_interface.find_frequency_of_elements.FrequencyCount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class FrequencyCountTest {

    @Test
    public void testCountFrequency_NormalCase() {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
        FrequencyCount counter = new FrequencyCount();
        Map<String, Integer> result = counter.countFrequency(list);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 1);
        expected.put("orange", 1);

        assertEquals(expected, result, "Frequency count should match expected values");
    }

    @Test
    public void testCountFrequency_EmptyList() {
        List<String> list = new ArrayList<>();
        FrequencyCount counter = new FrequencyCount();
        Map<String, Integer> result = counter.countFrequency(list);

        assertTrue(result.isEmpty(), "Frequency count for an empty list should be empty");
    }

    @Test
    public void testCountFrequency_UniqueElements() {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        FrequencyCount counter = new FrequencyCount();
        Map<String, Integer> result = counter.countFrequency(list);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 1);
        expected.put("banana", 1);
        expected.put("cherry", 1);

        assertEquals(expected, result, "Each unique element should have a count of 1");
    }

    @Test
    public void testCountFrequency_AllSameElements() {
        List<String> list = Arrays.asList("apple", "apple", "apple");
        FrequencyCount counter = new FrequencyCount();
        Map<String, Integer> result = counter.countFrequency(list);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 3);

        assertEquals(expected, result, "All elements being the same should result in a single entry with correct count");
    }
}
