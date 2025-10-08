package java21.methods;

class Counter {
    private int count = 0;

    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

class ThreadSafeCounter extends Thread {
    private Counter counter;

    public ThreadSafeCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class SynchronizedMethods {

    public static void main(String[] args) {
        Counter counter = new Counter();
        ThreadSafeCounter threadSafeCounter1 = new ThreadSafeCounter(counter);
        ThreadSafeCounter threadSafeCounter2 = new ThreadSafeCounter(counter);

        threadSafeCounter1.start();
        threadSafeCounter2.start();

        try {
            threadSafeCounter1.join();
            threadSafeCounter2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
