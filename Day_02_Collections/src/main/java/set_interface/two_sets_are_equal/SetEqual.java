package set_interface.two_sets_are_equal;
import java.util.Set;

public class SetEqual {
    public boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {
        if (set1 == null || set2 == null) {
            return false;
        }
        return set1.containsAll(set2) && set2.containsAll(set1);
    }
}
