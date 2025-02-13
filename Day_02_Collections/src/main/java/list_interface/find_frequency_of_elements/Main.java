package list_interface.find_frequency_of_elements;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("apple", "banana", "apple", "orange");

        FrequencyCount counter = new FrequencyCount();
        Map<String, Integer> result = counter.countFrequency(inputList);

        System.out.println("Frequency of Elements: " + result);
    }
}
