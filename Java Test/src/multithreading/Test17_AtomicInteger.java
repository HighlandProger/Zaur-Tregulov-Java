package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Test17_AtomicInteger {

    static AtomicInteger counter = new AtomicInteger();

    public static void increment(){ //no need to synchronize method, cause operation is atomic.
        counter.addAndGet(1);
    }

    public static void main(String[] args) {
        Thread17 thread1 = new Thread17();
        Thread17 thread2 = new Thread17();

        thread1.start();
        thread2.start();

        System.out.println(counter);
    }
}

class Thread17 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i<1000; i++) {
            Test17_AtomicInteger.increment();
        }
    }
}
