package Map_Interface.invert_a_map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        Map<Integer, List<String>> invertedMap = MapInverter.invertMap(inputMap);

        System.out.println("Inverted Map: " + invertedMap);
    }

}
