package try_with_resources;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class FileReaderDemoTest {

    @Test
    void testFileReader() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        FileReaderDemo.fileReader();

        String output = outputStream.toString();
        assertFalse(output.contains("Error reading file"), "File reading should be successful");
    }
}
