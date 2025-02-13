package Map_Interface.wordfrequency_counter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WordFrequencyCounter {
    public static HashMap<String, Integer> countWordFrequency(String filePath) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {

                line = line.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");
                String[] words = line.split("\\s+"); // Split by spaces

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return wordCountMap;
    }
}
