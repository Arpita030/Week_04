package Map_interface.word_frequency_counter_1;
import Map_Interface.wordfrequency_counter.WordFrequencyCounter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordFrequencyTest {
    private Path tempFilePath;

    @BeforeEach
    void setUp() throws IOException {
        tempFilePath = Files.createTempFile("testFile", ".txt");
        try (FileWriter writer = new FileWriter(tempFilePath.toFile())) {
            writer.write("Hello world! Hello, Java.\n");
            writer.write("Java is awesome. Java is powerful.\n");
        }
    }

    @Test
    void testCountWordFrequency() {
        HashMap<String, Integer> wordCount = WordFrequencyCounter.countWordFrequency(tempFilePath.toString());

        assertEquals(2, wordCount.get("hello"));
        assertEquals(3, wordCount.get("java"));
        assertEquals(1, wordCount.get("world"));
        assertEquals(1, wordCount.get("awesome"));
        assertEquals(2, wordCount.get("is"));
        assertEquals(1, wordCount.get("powerful"));
    }
}
