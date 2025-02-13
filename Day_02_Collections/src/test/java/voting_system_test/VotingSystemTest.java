package voting_system_test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import voting_system.VotingSystem;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class VotingSystemTest {
    private VotingSystem votingSystem;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        votingSystem = new VotingSystem();
        System.setOut(new PrintStream(outputStreamCaptor)); // Capture console output
    }

    @Test
    void testCastVoteAndDisplayResults() {
        votingSystem.castVote("Arpita");
        votingSystem.castVote("Bobby");
        votingSystem.castVote("Arpita");
        votingSystem.castVote("Chandrika");
        votingSystem.castVote("Arpita");
        votingSystem.castVote("Bobby");

        votingSystem.displayResults();

        String output = outputStreamCaptor.toString().trim();
        assertTrue(output.contains("Arpita: 3 votes"));
        assertTrue(output.contains("Bobby: 2 votes"));
        assertTrue(output.contains("Chandrika: 1 votes"));
    }

    @Test
    void testDisplayVoteOrder() {
        votingSystem.castVote("Arpita");
        votingSystem.castVote("Bobby");
        votingSystem.castVote("Arpita");
        votingSystem.castVote("Chandrika");
        votingSystem.castVote("Arpita");
        votingSystem.castVote("Bobby");

        votingSystem.displayVoteOrder();

        String output = outputStreamCaptor.toString().trim();
        assertTrue(output.contains("Vote Order (As Cast):"));
        assertTrue(output.contains("Arpita: 3 votes"));
        assertTrue(output.contains("Bobby: 2 votes"));
        assertTrue(output.contains("Chandrika: 1 votes"));
    }
}
