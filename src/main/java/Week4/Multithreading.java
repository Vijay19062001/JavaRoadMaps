package Week4;

class MyThread extends Thread {
    public void run() {

    	for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is running, step: " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted!");
                return; 
            }
        }
        System.out.println(Thread.currentThread().getName() + " has finished its work.");
    }
}

public class Multithreading{
    public static void main(String[] args) {

    	MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        
        t1.setName("Thread-1");
        t2.setName("Thread-2");

        // Start the threads
        t1.start(); 
        t2.start();

        try {
            
            t1.join();
            System.out.println("Thread-1 has finished, now moving on.");
            
            // Interrupt Thread-2 if it's still running
            if (t2.isAlive()) {
                System.out.println("Thread-2 is still running, so we will interrupt it.");
                t2.interrupt(); 
            }
            
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("Both threads have completed, main thread ends.");
    }
}
