package set_interface.set_equal_test;

import org.junit.jupiter.api.Test;
import set_interface.set_equal_test.SetEqualTest;
import set_interface.two_sets_are_equal.SetEqual;;

import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class SetEqualTest {

    private final SetEqual checker = new SetEqual();

    @Test
    public void testEqualSets() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        assertTrue(checker.areSetsEqual(set1, set2));
    }

    @Test
    public void testUnequalSets() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);

        assertFalse(checker.areSetsEqual(set1, set2));
    }

    @Test
    public void testDifferentSizes() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);

        assertFalse(checker.areSetsEqual(set1, set2));
    }

    @Test
    public void testEmptySets() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        assertTrue(checker.areSetsEqual(set1, set2));
    }

    @Test
    public void testNullSets() {
        Set<Integer> set1 = null;
        Set<Integer> set2 = new HashSet<>();
        assertFalse(checker.areSetsEqual(set1, set2));
        assertFalse(checker.areSetsEqual(set2, set1));
        assertFalse(checker.areSetsEqual(null, null));
    }
}
