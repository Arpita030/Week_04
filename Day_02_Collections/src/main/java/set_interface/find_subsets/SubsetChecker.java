package set_interface.find_subsets;

import java.util.Set;

public class SubsetChecker {
    public boolean isSubset(Set<Integer> subset, Set<Integer> mainSet) {
        return mainSet.containsAll(subset);
    }
}
