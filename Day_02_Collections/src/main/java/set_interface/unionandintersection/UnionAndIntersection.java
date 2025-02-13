package set_interface.unionandintersection;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {
    public Set<Integer>findUnion(Set<Integer>set1,Set<Integer>set2){
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public Set<Integer>findIntersection(Set<Integer>set1,Set<Integer>set2){
        Set<Integer>intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }
}
