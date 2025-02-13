package list_interface.duplicateremove;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemover {
    public List<Integer>removeDuplicates(List<Integer> list){
        Set<Integer> seen=new HashSet<>();
        List<Integer>result =new ArrayList<>();

        int size = list.size();
        for (int i = 0; i < size; i++) {
            int num = list.get(i);
            if (!seen.contains(num)) {
                seen.add(num);
                result.add(num);
            }
        }
        return result;
    }
}
