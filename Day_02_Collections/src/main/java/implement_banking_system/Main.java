package implement_banking_system;

public class Main {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.addAccount(101, 5000.0);
        bank.addAccount(102, 3000.0);
        bank.addAccount(103, 7000.0);
        bank.addAccount(104, 1000.0);

        bank.displayAllAccounts();
        bank.displaySortedAccounts();

        bank.requestWithdrawal(101);
        bank.requestWithdrawal(103);

        bank.processWithdrawals();
    }
}
