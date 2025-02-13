package list_interface.find_nth_element;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> inputList = new LinkedList<>();
        inputList.add("A");
        inputList.add("B");
        inputList.add("C");
        inputList.add("D");
        inputList.add("E");

        int N = 2;

        ElementFinder finder = new ElementFinder();
        String result = finder.findNthFromEnd(inputList, N);

        if (result != null) {
            System.out.println("Nth element from the end: " + result);
        } else {
            System.out.println("Invalid N value");
        }
    }
}
