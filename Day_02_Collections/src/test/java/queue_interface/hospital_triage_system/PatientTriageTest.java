package queue_interface.hospital_triage_system;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.PriorityQueue;

class HospitalTriageTest {

    @Test
    void testPatientPriorityQueue() {
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.severity, p1.severity));

        triageQueue.offer(new Patient("John", 3));
        triageQueue.offer(new Patient("Alice", 5));
        triageQueue.offer(new Patient("Bob", 2));

        assertEquals("Alice", triageQueue.poll().name);
        assertEquals("John", triageQueue.poll().name);
        assertEquals("Bob", triageQueue.poll().name);
    }

    @Test
    void testEmptyQueue() {
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.severity, p1.severity));

        assertNull(triageQueue.poll());
    }
}