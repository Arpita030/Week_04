package queue_interface.reverse_queue;

import org.junit.jupiter.api.Test;
import queue_interface.reverse.ReverseQueue;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.Queue;

class ReverseQueueTest {

    @Test
    void testReverseQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        Queue<Integer> reversedQueue = ReverseQueue.reverseQueue(queue);

        // Expected output after reversal: [30, 20, 10]
        assertEquals(3, reversedQueue.size());
        assertEquals(30, reversedQueue.poll());
        assertEquals(20, reversedQueue.poll());
        assertEquals(10, reversedQueue.poll());

        assertTrue(reversedQueue.isEmpty());
    }

    @Test
    void testReverseEmptyQueue() {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> reversedQueue = ReverseQueue.reverseQueue(queue);

        assertTrue(reversedQueue.isEmpty());
    }

    @Test
    void testReverseSingleElementQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(42);

        Queue<Integer> reversedQueue = ReverseQueue.reverseQueue(queue);

        assertEquals(1, reversedQueue.size());
        assertEquals(42, reversedQueue.poll());
        assertTrue(reversedQueue.isEmpty());
    }
}
