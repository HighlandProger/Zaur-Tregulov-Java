package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Test12_ThreadPool2 {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        System.out.println("Thread pool starts work in 3 seconds");
        for (int i = 0; i<10; i++){
            //scheduledExecutorService.schedule(new RunnableImpl2(), 3, TimeUnit.SECONDS);
        }
        scheduledExecutorService.shutdown();

        //----------------------------------------------------------------------------------------------
        //scheduleWithFixedRate (time between beginning of the tasks)

        ScheduledExecutorService scheduledExecutorService2 = Executors.newScheduledThreadPool(5);
//        scheduledExecutorService2.scheduleAtFixedRate(new RunnableImpl2(), 3, 1, TimeUnit.SECONDS);
//        Thread.sleep(5000);
        scheduledExecutorService2.shutdown();

        //----------------------------------------------------------------------------------------------
        //scheduleWithFixedDelay (time between the end of the current task and the beginning of the next)

        ScheduledExecutorService scheduledExecutorService3 = Executors.newScheduledThreadPool(5);
//        scheduledExecutorService3.scheduleWithFixedDelay(new RunnableImpl2(), 3, 1, TimeUnit.SECONDS);
//        Thread.sleep(10000);
        scheduledExecutorService3.shutdown();

        //----------------------------------------------------------------------------------------------
        //newCachedThreadPool 

        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i<10; i++){
            executorService.execute(new RunnableImpl2());
        }
        executorService.shutdown();
    }
}

class RunnableImpl2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
