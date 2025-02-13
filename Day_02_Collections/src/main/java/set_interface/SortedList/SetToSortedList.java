package set_interface.SortedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class SetToSortedList {
    public List<Integer>convertToSortedList(Set<Integer>set){
        List<Integer>aftersorting= new ArrayList<>(set);
        Collections.sort(aftersorting);
        return  aftersorting;
    }
}
