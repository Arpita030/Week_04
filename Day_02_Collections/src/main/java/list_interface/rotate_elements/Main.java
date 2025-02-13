package list_interface.rotate_elements;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2;

        System.out.println("Original List: " + inputList);

        ListRotator rotator = new ListRotator();
        rotator.rotateList(inputList, rotateBy);

        System.out.println("Rotated List: " + inputList);
    }
}

