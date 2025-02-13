package queue_interface.circular_buffer_simulation;

class CircularBuffer {
    private int[] buffer;
    private int front, rear, size, capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int value) {

        if (size == capacity) {
            front = (front + 1) % capacity;
        } else {
            size++;
        }
        rear = (rear + 1) % capacity;
        buffer[rear] = value;
    }
    public int dequeue() {
        if (size == 0) {
            throw new RuntimeException("Buffer is empty");
        }
        int removedValue = buffer[front];
        front = (front + 1) % capacity;
        size--;
        return removedValue;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Buffer is empty");
            return;
        }
        System.out.print("Buffer: ");
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}
