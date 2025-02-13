package Map_Interface.wordfrequency_counter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String filePath = "sample.txt";

        HashMap<String, Integer> wordCount = WordFrequencyCounter.countWordFrequency(filePath);

        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
