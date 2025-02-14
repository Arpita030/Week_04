package unchecked_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void inputMismatch() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a numerator");
            int numerator = sc.nextInt();
            System.out.println("Enter a Denominator");
            int denominator = sc.nextInt();
            ArithmeticExceptionDemo.divide(numerator,denominator);
        } catch (InputMismatchException e) {
            System.out.println("please enter a valid integer");
        }
    }
}
