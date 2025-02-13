package list_interface.find_nth_element;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

class ElementFinderTest {

    @Test
    void testFindNthFromEnd_ValidN() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        ElementFinder finder = new ElementFinder();
        assertEquals("D", finder.findNthFromEnd(list, 2));
    }

    @Test
    void testFindNthFromEnd_FirstElement() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        ElementFinder finder = new ElementFinder();
        assertEquals("C", finder.findNthFromEnd(list, 1));
    }

    @Test
    void testFindNthFromEnd_LastElement() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        ElementFinder finder = new ElementFinder();
        assertEquals("A", finder.findNthFromEnd(list, 3));
    }

    @Test
    void testFindNthFromEnd_InvalidN() {
        LinkedList<String> list = new LinkedList<>();
        list.add("X");
        list.add("Y");
        list.add("Z");

        ElementFinder finder = new ElementFinder();
        assertNull(finder.findNthFromEnd(list, 4));  // Out of bounds
        assertNull(finder.findNthFromEnd(list, -1)); // Negative N
        assertNull(finder.findNthFromEnd(list, 0));  // Zero N
    }

    @Test
    void testFindNthFromEnd_EmptyList() {
        LinkedList<String> list = new LinkedList<>();

        ElementFinder finder = new ElementFinder();
        assertNull(finder.findNthFromEnd(list, 1));
    }
}
