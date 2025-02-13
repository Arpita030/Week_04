package queue_interface.generate_binary_number_using_queue;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int N = 5;


        BinaryNumber bn=new BinaryNumber();
        List<String> binaryNumbers = bn.generateBinaryNumbers(N);
        System.out.println(binaryNumbers);
    }
}
