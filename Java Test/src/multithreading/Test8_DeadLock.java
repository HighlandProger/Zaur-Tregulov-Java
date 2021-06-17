package multithreading;

public class Test8_DeadLock {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread10();
        Thread thread2 = new Thread20();

        thread1.start();
        thread2.start();
    }
}

class Thread10 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread10: trying to grab lock1");
        synchronized (Test8_DeadLock.lock1) {
            System.out.println("Thread10: lock1 is grabbed");
            System.out.println("Thread10: trying to grab lock2");
            synchronized (Test8_DeadLock.lock2) {
                System.out.println("Thread10: lock2 is grabbed");
            }
        }
    }
}

class Thread20 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread20: trying to grab lock2");
        synchronized (Test8_DeadLock.lock2) {
            System.out.println("Thread20: lock2 is grabbed");
            System.out.println("Thread20: trying to grab lock1");
            synchronized (Test8_DeadLock.lock1) {
                System.out.println("Thread20: lock1 is grabbed");
            }
        }
    }
}
// you have to use the SAME algorithm of synchronization (ex: lock1 -> lock2)