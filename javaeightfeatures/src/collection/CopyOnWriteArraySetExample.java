package collection;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetExample {
    public static void main(String[] args) {
        // Create a CopyOnWriteArraySet
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();

        // Add elements to the set
        set.add("Element1");
        set.add("Element2");
        set.add("Element3");

        // Create a thread that iterates over the set
        Thread iteratorThread = new Thread(() -> {
            for (String element : set) {
                System.out.println("Iterator Thread: " + element);
                try {
                    Thread.sleep(100); // Sleep to simulate some delay
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Create a thread that modifies the set
        Thread modifierThread = new Thread(() -> {
            set.add("Element4");
            System.out.println("Modifier Thread: Added Element4");
            set.remove("Element2");
            System.out.println("Modifier Thread: Removed Element2");
        });

        // Start both threads
        iteratorThread.start();
        modifierThread.start();

        // Wait for both threads to complete
        try {
            iteratorThread.join();
            modifierThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Final state of the set
        System.out.println("Final set contents: " + set);
    }
}
