package multithreading;

import java.util.concurrent.CountDownLatch;

public class Test15_CountDownLatch {
    private static CountDownLatch countDownLatch = new CountDownLatch(3);

    public static void staffIsOnTheWorkplace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Staff came to the job");
        countDownLatch.countDown();
        System.out.println("countDown is " + countDownLatch.getCount());
    }
    public static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready, let's start");
        countDownLatch.countDown();
        System.out.println("countDown is " + countDownLatch.getCount());
    }
    public static void openTheDoors() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Doors are opened");
        countDownLatch.countDown();
        System.out.println("countDown is " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Ivan", countDownLatch);
        new Friend("Oleg", countDownLatch);
        new Friend("Elena", countDownLatch);
        new Friend("John", countDownLatch);
        new Friend("Steve", countDownLatch);

        staffIsOnTheWorkplace();
        everythingIsReady();
        openTheDoors();
    }
}

class Friend extends Thread{

    String name;
    CountDownLatch countDownLatch;
    public Friend(String name, CountDownLatch countDownLatch){
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(this.name + " started shopping");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}