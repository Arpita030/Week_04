package unchecked_exception;

public class ArithmeticExceptionDemo {
    public static void divide(int numerator, int denominator) {
        try {
            int result= numerator / denominator;
            System.out.println("Result is "+ result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}

