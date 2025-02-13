package queue_interface.reverse;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Original Queue: " + queue);
        ReverseQueue reverse=new ReverseQueue();
        Queue<Integer> reversedQueue =reverse.reverseQueue(queue);
        System.out.println("Reversed Queue: " + reversedQueue);
    }
}
