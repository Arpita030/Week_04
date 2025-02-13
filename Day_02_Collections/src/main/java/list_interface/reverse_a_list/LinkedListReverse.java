package list_interface.reverse_a_list;

import java.util.LinkedList;

class LinkedListReverse {
    public void reverse(LinkedList<Integer> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}