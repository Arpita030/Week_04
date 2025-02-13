package Map_Interface.Key_with_highestvalue;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        String maxKey = MaxKeyFinder.findMaxKey(inputMap);

        System.out.println("Key with the highest value: " + maxKey);
    }
}
