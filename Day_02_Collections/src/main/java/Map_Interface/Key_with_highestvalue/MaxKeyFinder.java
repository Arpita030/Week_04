package Map_Interface.Key_with_highestvalue;

import java.util.Map;

import java.util.*;

public class MaxKeyFinder {
    public static String findMaxKey(Map<String, Integer> inputMap) {
        if (inputMap.isEmpty()) {
            return null;
        }

        List<String> keys = new ArrayList<>(inputMap.keySet());
        String maxKey = keys.get(0);
        int maxValue = inputMap.get(maxKey);

        for (int i = 1; i < keys.size(); i++) {
            String key = keys.get(i);
            int value = inputMap.get(key);

            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }

        return maxKey;
    }
}
