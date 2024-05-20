package basicprogram;

import java.util.ArrayList;
import java.util.List;

public class SimpleWildcardExample {

    // Method that accepts a list of any type
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        // Using the method to print lists of different types
        System.out.println("Printing String List:");
        printList(stringList);

        System.out.println("Printing Integer List:");
        printList(intList);
    }
}
