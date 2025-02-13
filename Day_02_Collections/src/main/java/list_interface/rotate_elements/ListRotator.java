package list_interface.rotate_elements;

import java.util.*;

public class ListRotator {
    public void rotateList(List<Integer> list, int positions) {
        int size = list.size();
        if (size == 0) return;  // Prevent division by zero

        positions = positions % size;
        if (positions == 0) return;

        List<Integer> rotatedList = new ArrayList<>();
        rotatedList.addAll(list.subList(positions, size));
        rotatedList.addAll(list.subList(0, positions));

        list.clear();
        list.addAll(rotatedList);
    }
}
