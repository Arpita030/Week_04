package queue_interface.hospital_triage_system;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.severity, p1.severity));

        triageQueue.offer(new Patient("John", 3));
        triageQueue.offer(new Patient("Alice", 5));
        triageQueue.offer(new Patient("Bob", 2));

        System.out.println("Order of Treatment:");
        while (!triageQueue.isEmpty()) {
            System.out.println(triageQueue.poll().name);
        }
    }
}