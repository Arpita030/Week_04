package list_interface.duplicate_remover;

import list_interface.duplicateremove.DuplicateRemover;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateRemoverTest {

    @Test
    void testRemoveDuplicates_WithDuplicates() {
        List<Integer> inputList = Arrays.asList(3, 1, 2, 2, 3, 4);
        DuplicateRemover remover = new DuplicateRemover();
        List<Integer> result = remover.removeDuplicates(inputList);
        assertEquals(Arrays.asList(3, 1, 2, 4), result);
    }

    @Test
    void testRemoveDuplicates_NoDuplicates() {
        List<Integer> inputList = Arrays.asList(5, 6, 7, 8);
        DuplicateRemover remover = new DuplicateRemover();
        List<Integer> result = remover.removeDuplicates(inputList);
        assertEquals(Arrays.asList(5, 6, 7, 8), result);
    }

    @Test
    void testRemoveDuplicates_EmptyList() {
        List<Integer> inputList = new ArrayList<>();
        DuplicateRemover remover = new DuplicateRemover();
        List<Integer> result = remover.removeDuplicates(inputList);
        assertTrue(result.isEmpty());
    }

    @Test
    void testRemoveDuplicates_SingleElement() {
        List<Integer> inputList = Collections.singletonList(10);
        DuplicateRemover remover = new DuplicateRemover();
        List<Integer> result = remover.removeDuplicates(inputList);
        assertEquals(Collections.singletonList(10), result);
    }

    @Test
    void testRemoveDuplicates_AllSameElements() {
        List<Integer> inputList = Arrays.asList(9, 9, 9, 9);
        DuplicateRemover remover = new DuplicateRemover();
        List<Integer> result = remover.removeDuplicates(inputList);
        assertEquals(Collections.singletonList(9), result);
    }
}
