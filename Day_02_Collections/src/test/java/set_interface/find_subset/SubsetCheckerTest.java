package set_interface.find_subset;

import org.junit.jupiter.api.Test;
import set_interface.find_subsets.SubsetChecker;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;

public class SubsetCheckerTest {

    @Test
    public void testIsSubset_True() {
        Set<Integer> subset = new HashSet<>();
        subset.add(2);
        subset.add(3);

        Set<Integer> mainSet = new HashSet<>();
        mainSet.add(1);
        mainSet.add(2);
        mainSet.add(3);
        mainSet.add(4);

        SubsetChecker checker = new SubsetChecker();
        assertTrue(checker.isSubset(subset, mainSet), "set1 should be a subset of set2");
    }

    @Test
    public void testIsSubset_False() {
        Set<Integer> subset = new HashSet<>();
        subset.add(5);

        Set<Integer> mainSet = new HashSet<>();
        mainSet.add(1);
        mainSet.add(2);
        mainSet.add(3);
        mainSet.add(4);

        SubsetChecker checker = new SubsetChecker();
        assertFalse(checker.isSubset(subset, mainSet), "set1 should not be a subset of set2");
    }

    @Test
    public void testIsSubset_EmptySubset() {
        Set<Integer> subset = new HashSet<>();
        Set<Integer> mainSet = new HashSet<>();
        mainSet.add(1);
        mainSet.add(2);

        SubsetChecker checker = new SubsetChecker();
        assertTrue(checker.isSubset(subset, mainSet), "An empty set is always a subset of any set");
    }

    @Test
    public void testIsSubset_EmptyMainSet() {
        Set<Integer> subset = new HashSet<>();
        subset.add(1);

        Set<Integer> mainSet = new HashSet<>();

        SubsetChecker checker = new SubsetChecker();
        assertFalse(checker.isSubset(subset, mainSet), "A non-empty subset cannot be a subset of an empty set");
    }
}
