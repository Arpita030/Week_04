package throw_vs_throws;

import java.util.Scanner;

public class CalculateInterest {
    public static void calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (rate < 0 || amount < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        System.out.println("Interest :" + (amount*rate*years)/100);
    }
}
