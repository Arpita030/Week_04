package try_with_resources;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java .io.IOException;
import java.io.BufferedReader;

public class FileReaderDemo {
    public static void fileReader() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/Example.txt"))) {
            String line;
            line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}