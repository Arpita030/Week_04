package list_interface.find_nth_element;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ElementFinder {
    public String findNthFromEnd(LinkedList<String> list, int n) {
        if (list == null || n <= 0 || n > list.size()) {
            return null;
        }

        List<String> reversedList = new LinkedList<>(list);
        Collections.reverse(reversedList);

        return reversedList.get(n - 1);
    }
}
