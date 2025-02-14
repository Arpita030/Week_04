package IoExceptiontTest;

import checked_exception.IoExceptionExample;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class IoExceptionExampleTest {

    @Test
    void testFileReadingSuccess(@TempDir Path tempDir) throws IOException {
        Path tempFile = tempDir.resolve("Example.txt");
        Files.write(tempFile, "Hello, World!\nThis is a test file.".getBytes());

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        IoExceptionExample.main(new String[]{});

        System.setOut(originalOut);

        String output = outputStream.toString().trim();
        assertTrue(output.contains("Hello, World!"));
        assertTrue(output.contains("This is a test file."));
    }

    @Test
    void testFileNotFound() {
        ByteArrayOutputStream errorStream = new ByteArrayOutputStream();
        PrintStream originalErr = System.err;
        System.setErr(new PrintStream(errorStream));

        IoExceptionExample.main(new String[]{});

        System.setErr(originalErr);

        String errorOutput = errorStream.toString().trim();
        assertTrue(errorOutput.startsWith("File not found"));
    }
}
