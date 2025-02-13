package queue_interface.circular_buffer_simulation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircularBufferTest {

    @Test
    void testEnqueueAndDisplay() {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);
        buffer.enqueue(4); // Overwrites 1

        assertEquals(2, buffer.dequeue()); // 1 was overwritten, so 2 should be dequeued
        assertEquals(3, buffer.dequeue());
        assertEquals(4, buffer.dequeue());
    }

    @Test
    void testDequeueOnEmptyBuffer() {
        CircularBuffer buffer = new CircularBuffer(3);
        Exception exception = assertThrows(RuntimeException.class, buffer::dequeue);
        assertEquals("Buffer is empty", exception.getMessage());
    }

    @Test
    void testCircularEnqueueDequeue() {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.enqueue(10);
        buffer.enqueue(20);
        buffer.enqueue(30);
        assertEquals(10, buffer.dequeue());

        buffer.enqueue(40); // Should take the place of dequeued 10

        assertEquals(20, buffer.dequeue());
        assertEquals(30, buffer.dequeue());
        assertEquals(40, buffer.dequeue());

        assertThrows(RuntimeException.class, buffer::dequeue); // Should throw empty buffer error
    }

    @Test
    void testBufferOverflow() {
        CircularBuffer buffer = new CircularBuffer(2);
        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3); // Should overwrite 1

        assertEquals(2, buffer.dequeue()); // 1 was overwritten, so 2 should be dequeued first
        assertEquals(3, buffer.dequeue());

        assertThrows(RuntimeException.class, buffer::dequeue); // Buffer should be empty now
    }
}
