package list_interface.duplicateremove;

import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(3, 1, 2, 2, 3, 4);

        DuplicateRemover remover = new DuplicateRemover();
        List<Integer> result = remover.removeDuplicates(inputList);

        System.out.println("List after removing duplicates: " + result);
    }
}
