package bank_transaction_system;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);
        try {
            account.withdraw(600);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
