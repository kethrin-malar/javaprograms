package thread;

import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  



public class TestThreadPool {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Create and submit 5 tasks to the thread pool
        for (int i = 1; i <= 5; i++) {
            Runnable worker = new WorkerThread("Task " + i);
            executor.execute(worker);
        }

        // Shutdown the executor to prevent new tasks from being submitted
        executor.shutdown();
        
        // Wait until all tasks are finished
        while (!executor.isTerminated()) {
        }

        System.out.println("All tasks are finished!");
    }
}

class WorkerThread implements Runnable {
    private final String taskName;

    public WorkerThread(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing " + taskName);
        try {
            Thread.sleep(2000);  // Simulate some work with sleep
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished " + taskName);
    }
}
