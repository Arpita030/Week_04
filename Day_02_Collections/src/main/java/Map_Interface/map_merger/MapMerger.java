package Map_Interface.map_merger;

import java.util.*;

public class MapMerger {
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> mergedMap = new HashMap<>(map1);
        for (String key : map2.keySet()) {
            if (mergedMap.containsKey(key)) {
                mergedMap.put(key, mergedMap.get(key) + map2.get(key));
            } else {
                mergedMap.put(key, map2.get(key));
            }
        }

        return mergedMap;
    }
}
