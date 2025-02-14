package finally_block_execution;

public class Divison {
    public static void division(int numerator,int denominator){
        try{
            int result=numerator/denominator;
            System.out.println("Result is"+result);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception occured ");
        }
        finally {
            System.out.println("Operation completed");
        }
    }
}
