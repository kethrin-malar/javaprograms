package collection;

import java.util.ArrayList;

public class FirstElementArraylistSample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("APPLE");
        list.add("Banana");
        list.add("Cherry");

        String firstElement = null;

        if (!list.isEmpty()) {
            // Get the first element
            firstElement = list.get(0);
        }

        if (firstElement != null) {
            System.out.println("The first element is: " + firstElement);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
