package queue_interface.implement_a_stack_using_queues;

public class Main {
        public static void main(String[] args) {
            StackUsingQueues stack = new StackUsingQueues();

            stack.push(1);
            stack.push(2);
            stack.push(3);

            System.out.println("Popped: " + stack.pop());
            System.out.println("Top element: " + stack.top());
            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());
            System.out.println("Is stack empty? " + stack.isEmpty());
        }

}
