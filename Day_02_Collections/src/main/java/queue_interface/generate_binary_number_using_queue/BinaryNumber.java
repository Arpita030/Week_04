package queue_interface.generate_binary_number_using_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryNumber {
    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.offer("1"); // Start with "1"

        for (int i = 0; i < N; i++) {
            String binary = queue.poll();
            result.add(binary);

            // Generate next binary numbers and add them to the queue
            queue.offer(binary + "0");
            queue.offer(binary + "1");
        }

        return result;
    }
}