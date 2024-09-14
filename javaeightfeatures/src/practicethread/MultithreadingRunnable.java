package practicethread;


public class MultithreadingRunnable {
    public static void main(String[] args) {
        // Creating thread objects
        Thread thread1 = new Thread(new PrintNumbers());
        Thread thread2 = new Thread(new PrintLetters());

        // Starting threads
        thread1.start();
        thread2.start();
    }
}

// Task to print numbers
class PrintNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(2000);  // Simulate some delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Task to print letters
class PrintLetters implements Runnable {
    @Override
    public void run() {
        for (char letter = 'A'; letter <= 'E'; letter++) {
            System.out.println("Letter: " + letter);
            try {
                Thread.sleep(1000);  // Simulate some delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
