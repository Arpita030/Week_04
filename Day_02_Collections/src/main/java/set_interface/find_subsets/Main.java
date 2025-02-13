package set_interface.find_subsets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        SubsetChecker checker = new SubsetChecker();
        boolean result = checker.isSubset(set1, set2);

        System.out.println("Is set1 a subset of set2? " + result);
    }
}
