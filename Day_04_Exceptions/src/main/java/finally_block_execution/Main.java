package finally_block_execution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numerator");
        int numerator= sc.nextInt();
        System.out.println("Enter the Denominator");
        int denominator= sc.nextInt();
        Divison.division(numerator,denominator);
    }
}
