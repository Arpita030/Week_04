package list_interface.rotate_element_in_list;
import list_interface.rotate_elements.ListRotator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class ListRotatorTest {

    @Test
    public void testRotateList_NormalCase() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        ListRotator rotator = new ListRotator();
        rotator.rotateList(list, 2);

        List<Integer> expected = Arrays.asList(30, 40, 50, 10, 20);
        assertEquals(expected, list, "List should be rotated by 2 positions");
    }

    @Test
    public void testRotateList_FullRotation() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        ListRotator rotator = new ListRotator();
        rotator.rotateList(list, 5);

        List<Integer> expected = Arrays.asList(10, 20, 30, 40, 50);
        assertEquals(expected, list, "Rotating by the size of the list should result in the same list");
    }

    @Test
    public void testRotateList_NoRotation() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        ListRotator rotator = new ListRotator();
        rotator.rotateList(list, 0);

        List<Integer> expected = Arrays.asList(10, 20, 30, 40, 50);
        assertEquals(expected, list, "Rotating by 0 positions should result in the same list");
    }

    @Test
    public void testRotateList_EmptyList() {
        List<Integer> list = new ArrayList<>();
        ListRotator rotator = new ListRotator();
        rotator.rotateList(list, 3);

        assertTrue(list.isEmpty(), "Rotating an empty list should result in an empty list");
    }

    @Test
    public void testRotateList_SingleElement() {
        List<Integer> list = new ArrayList<>(Collections.singletonList(42));
        ListRotator rotator = new ListRotator();
        rotator.rotateList(list, 3);

        List<Integer> expected = Collections.singletonList(42);
        assertEquals(expected, list, "Rotating a single-element list should result in the same list");
    }
}
