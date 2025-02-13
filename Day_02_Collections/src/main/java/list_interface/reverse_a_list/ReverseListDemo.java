package list_interface.reverse_a_list;
import java.util.*;
public class ReverseListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original ArrayList: " + arrayList);

        ArrayListReverse arrayListReverse = new ArrayListReverse();
        arrayListReverse.reverse(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("\nOriginal LinkedList: " + linkedList);

        LinkedListReverse linkedListReverse = new LinkedListReverse();
        linkedListReverse.reverse(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}