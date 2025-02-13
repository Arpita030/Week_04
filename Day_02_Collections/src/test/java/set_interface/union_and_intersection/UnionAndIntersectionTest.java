package set_interface.union_and_intersection;

import org.junit.jupiter.api.Test;
import set_interface.unionandintersection.UnionAndIntersection;

import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class UnionAndIntersectionTest {

    private final UnionAndIntersection operation = new UnionAndIntersection();

    @Test
    public void testFindUnion() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> expectedUnion = new HashSet<>();
        expectedUnion.add(1);
        expectedUnion.add(2);
        expectedUnion.add(3);
        expectedUnion.add(4);
        expectedUnion.add(5);

        assertEquals(expectedUnion, operation.findUnion(set1, set2));
    }

    @Test
    public void testFindIntersection() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> expectedIntersection = new HashSet<>();
        expectedIntersection.add(3);

        assertEquals(expectedIntersection, operation.findIntersection(set1, set2));
    }

    @Test
    public void testEmptySets() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        assertTrue(operation.findUnion(set1, set2).isEmpty());
        assertTrue(operation.findIntersection(set1, set2).isEmpty());
    }
}
