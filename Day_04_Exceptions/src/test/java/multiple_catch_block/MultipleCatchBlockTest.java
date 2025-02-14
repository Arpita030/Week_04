package multiple_catch_block;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class MultipleCatchBlockTest {

    @Test
    void testValidIndex() {
        String input = "1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        MultipleCatchBlock.uncheckedException();

        String output = outputStream.toString();
        assertTrue(output.contains("Value at index 1:2"));
    }

    @Test
    void testInvalidIndex() {
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream errorStream = new ByteArrayOutputStream();
        System.setErr(new PrintStream(errorStream));

        MultipleCatchBlock.uncheckedException();

        String errorOutput = errorStream.toString();
        assertTrue(errorOutput.contains("Invalid index!"));
    }
}
