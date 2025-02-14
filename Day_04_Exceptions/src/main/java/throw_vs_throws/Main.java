package throw_vs_throws;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the amount ");
            double amount= sc.nextDouble();
            System.out.println("Enter the Rate ");
            double rate= sc.nextDouble();
            System.out.println("Enter the year ");
            int year= sc.nextInt();
            CalculateInterest.calculateInterest(amount,rate,year);
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
}
