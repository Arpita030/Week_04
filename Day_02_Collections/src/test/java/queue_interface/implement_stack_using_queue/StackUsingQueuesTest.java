package queue_interface.implement_stack_using_queue;

import org.junit.jupiter.api.Test;
import queue_interface.implement_a_stack_using_queues.StackUsingQueues;

import static org.junit.jupiter.api.Assertions.*;

class StackUsingQueuesTest {

    @Test
    void testPushAndPop() {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop()); // Last in, first out
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    void testTop() {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(5);
        stack.push(10);

        assertEquals(10, stack.top()); // Last element pushed should be on top
        stack.pop();
        assertEquals(5, stack.top()); // Now top should be 5
    }

    @Test
    void testIsEmpty() {
        StackUsingQueues stack = new StackUsingQueues();
        assertTrue(stack.isEmpty()); // Initially empty

        stack.push(7);
        assertFalse(stack.isEmpty()); // Should not be empty after push

        stack.pop();
        assertTrue(stack.isEmpty()); // Should be empty after popping last element
    }

    @Test
    void testPopOnEmptyStack() {
        StackUsingQueues stack = new StackUsingQueues();
        Exception exception = assertThrows(RuntimeException.class, stack::pop);
        assertEquals("Stack is empty", exception.getMessage());
    }

    @Test
    void testTopOnEmptyStack() {
        StackUsingQueues stack = new StackUsingQueues();
        Exception exception = assertThrows(RuntimeException.class, stack::top);
        assertEquals("Stack is empty", exception.getMessage());
    }
}
