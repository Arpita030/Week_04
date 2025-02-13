package banking_system_test;

import static org.junit.jupiter.api.Assertions.*;

import implement_banking_system.BankingSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BankingSystemTest {
    private BankingSystem bankingSystem;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        bankingSystem = new BankingSystem();
        System.setOut(new PrintStream(outContent)); // Capture console output
    }

    @Test
    void testAddAccount() {
        bankingSystem.addAccount(101, 5000.0);
        bankingSystem.addAccount(102, 3000.0);
        bankingSystem.addAccount(103, 7000.0);

        bankingSystem.displayAllAccounts();
        String output = outContent.toString();
        assertTrue(output.contains("Account 101 - Balance: $5000.0"));
        assertTrue(output.contains("Account 102 - Balance: $3000.0"));
        assertTrue(output.contains("Account 103 - Balance: $7000.0"));
    }

    @Test
    void testSortedAccounts() {
        bankingSystem.addAccount(101, 5000.0);
        bankingSystem.addAccount(102, 3000.0);
        bankingSystem.addAccount(103, 7000.0);

        bankingSystem.displaySortedAccounts();
        String output = outContent.toString();

        assertTrue(output.contains("Account 102 - Balance: $3000.0"));
        assertTrue(output.contains("Account 101 - Balance: $5000.0"));
        assertTrue(output.contains("Account 103 - Balance: $7000.0"));
    }

    @Test
    void testRequestWithdrawal() {
        bankingSystem.addAccount(101, 5000.0);
        bankingSystem.requestWithdrawal(101);

        String output = outContent.toString();
        assertTrue(output.contains("Withdrawal request added for account: 101"));
    }

    @Test
    void testProcessWithdrawals() {
        bankingSystem.addAccount(101, 5000.0);
        bankingSystem.addAccount(102, 3000.0);

        bankingSystem.requestWithdrawal(101);
        bankingSystem.requestWithdrawal(102);
        bankingSystem.processWithdrawals();

        String output = outContent.toString();
        assertTrue(output.contains("Processing withdrawal for account: 101"));
        assertTrue(output.contains("Processing withdrawal for account: 102"));
    }

    @Test
    void testInvalidWithdrawalRequest() {
        bankingSystem.requestWithdrawal(999); // Non-existing account
        String output = outContent.toString();
        assertTrue(output.contains("Account not found!"));
    }
}
