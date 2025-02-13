package set_interface.symmetric_difference;

import org.junit.jupiter.api.Test;
import set_interface.symmetricdifference.Difference;

import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class DifferenceTest {

    private final Difference operation = new Difference();

    @Test
    public void testSymmetricDifference() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> expectedDifference = new HashSet<>();
        expectedDifference.add(1);
        expectedDifference.add(2);
        expectedDifference.add(4);
        expectedDifference.add(5);

        assertEquals(expectedDifference, operation.symmetricDifference(set1, set2));
    }

    @Test
    public void testEmptySets() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        assertTrue(operation.symmetricDifference(set1, set2).isEmpty());
    }

    @Test
    public void testOneEmptySet() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);

        assertEquals(set2, operation.symmetricDifference(set1, set2));
    }
}
