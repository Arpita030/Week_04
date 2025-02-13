package list_interface.reverse_a_list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class ReverseListTest {

    @Test
    public void testArrayListReverse() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayListReverse reverser = new ArrayListReverse();
        reverser.reverse(list);
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), list, "ArrayList should be reversed");
    }

    @Test
    public void testLinkedListReverse() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        LinkedListReverse reverser = new LinkedListReverse();
        reverser.reverse(list);
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), list, "LinkedList should be reversed");
    }

    @Test
    public void testArrayListReverseEmpty() {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayListReverse reverser = new ArrayListReverse();
        reverser.reverse(list);
        assertEquals(Collections.emptyList(), list, "Empty ArrayList should remain empty");
    }

    @Test
    public void testLinkedListReverseEmpty() {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedListReverse reverser = new LinkedListReverse();
        reverser.reverse(list);
        assertEquals(Collections.emptyList(), list, "Empty LinkedList should remain empty");
    }

    @Test
    public void testArrayListReverseSingleElement() {
        ArrayList<Integer> list = new ArrayList<>(Collections.singletonList(1));
        ArrayListReverse reverser = new ArrayListReverse();
        reverser.reverse(list);
        assertEquals(Collections.singletonList(1), list, "Single-element ArrayList should remain unchanged");
    }

    @Test
    public void testLinkedListReverseSingleElement() {
        LinkedList<Integer> list = new LinkedList<>(Collections.singletonList(1));
        LinkedListReverse reverser = new LinkedListReverse();
        reverser.reverse(list);
        assertEquals(Collections.singletonList(1), list, "Single-element LinkedList should remain unchanged");
    }
}
