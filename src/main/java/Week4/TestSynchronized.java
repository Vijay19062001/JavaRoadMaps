package Week4;

class Counting {
    private int count = 0;

    // Unsynchronized increment method
    public void incrementUnsynchronized() {
        count++;
    }

    // Synchronized increment method
    public synchronized void incrementSynchronized() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class TestSynchronized {
    public static void main(String[] args) throws InterruptedException {

    	Counting unsynchronizedCounter = new Counting();
        
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                unsynchronizedCounter.incrementUnsynchronized(); // Unsynchronized method call
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                unsynchronizedCounter.incrementUnsynchronized(); // Unsynchronized method call
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count after unsynchronized execution: " + unsynchronizedCounter.getCount());

        // Synchronized test
        Counting synchronizedCounter = new Counting();

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronizedCounter.incrementSynchronized(); // Synchronized method call
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronizedCounter.incrementSynchronized(); // Synchronized method call
            }
        });

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println("Final count after synchronized execution: " + synchronizedCounter.getCount());
    }
}
