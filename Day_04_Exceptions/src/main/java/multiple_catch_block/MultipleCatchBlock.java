package multiple_catch_block;

import java.util.Scanner;

public class MultipleCatchBlock {
    public static void uncheckedException(){
        try{
            int[]numbers={1,2,3};
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a Index ");
            int x=sc.nextInt();
            System.out.println("Value at index "+x +":"+numbers[x]);
            numbers=null;
            System.out.println(numbers[2]);

        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid index!");
        }catch (NullPointerException e){
            System.out.println("Array is not initialized!");

        }


    }
}
