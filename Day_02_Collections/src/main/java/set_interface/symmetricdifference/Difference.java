package set_interface.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

public class Difference {
    public Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> differ = new HashSet<>(set1);
        Set<Integer> temp = new HashSet<>(set2);

        differ.removeAll(set2);
        temp.removeAll(set1);

        differ.addAll(temp);
        return differ;
    }
}
