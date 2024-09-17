package week5;

import java.util.concurrent.*;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyApi {

    // Shared resource
    private static int sharedCounter = 0;
    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // Create a fixed thread pool with 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Use CountDownLatch to wait for multiple threads to finish
        CountDownLatch latch = new CountDownLatch(3);

        // Create tasks using Callable and submit them to the executor service
        List<Future<Integer>> futureList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            final int taskId = i;
            Future<Integer> future = executorService.submit(new Callable<Integer>() {


                @Override
                public Integer call() throws Exception {
                    try {
                        lock.lock();
                        System.out.println("Task " + taskId + " is incrementing the counter.");
                        sharedCounter += 1;
                        Thread.sleep(1000); // Simulate some work
                    } finally {
                        lock.unlock();
                    }
                    latch.countDown(); // Signal that this task is done
                    return sharedCounter; // Return the updated counter
                }
            });
            futureList.add(future);
        }

        // Wait for all tasks to finish
        latch.await();
        System.out.println("All tasks finished. Final sharedCounter value: " + sharedCounter);

        // Collect and print the results from all futures
        for (Future<Integer> future : futureList) {
            System.out.println("Task result: " + future.get());
        }

        // Use CompletableFuture to handle asynchronous tasks
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
            try {
                lock.lock();
                System.out.println("CompletableFuture task is running asynchronously.");
                sharedCounter += 10; // Increment the counter asynchronously
                Thread.sleep(500); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        // Block until CompletableFuture task is done
        completableFuture.join();
        System.out.println("CompletableFuture task finished. Updated sharedCounter: " + sharedCounter);

        // Shutdown the executor service
        executorService.shutdown();
    }
}
