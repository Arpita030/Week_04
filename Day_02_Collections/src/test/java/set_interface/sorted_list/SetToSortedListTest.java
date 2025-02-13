package set_interface.sorted_list;

import org.junit.jupiter.api.Test;
import set_interface.SortedList.SetToSortedList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class SetToSortedListTest {

    private final SetToSortedList converter = new SetToSortedList();

    @Test
    public void testConvertToSortedList() {
        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(5);
        numberSet.add(3);
        numberSet.add(9);
        numberSet.add(1);

        List<Integer> expectedSortedList = List.of(1, 3, 5, 9);

        assertEquals(expectedSortedList, converter.convertToSortedList(numberSet));
    }

    @Test
    public void testEmptySet() {
        Set<Integer> numberSet = new HashSet<>();
        assertTrue(converter.convertToSortedList(numberSet).isEmpty());
    }

    @Test
    public void testSingleElementSet() {
        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(7);

        List<Integer> expectedSortedList = List.of(7);
        assertEquals(expectedSortedList, converter.convertToSortedList(numberSet));
    }
}
