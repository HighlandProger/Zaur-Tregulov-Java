package multithreading;

import java.util.concurrent.ArrayBlockingQueue;

import static java.lang.Thread.sleep;

public class Test21_ArrayBlockingQueue {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);

        new Thread(() -> {
            Integer i = 0;
            while (true){
                try {
                    queue.put(++i);
                    System.out.println("Producer added :" + i + " " +queue);
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

        new Thread(() -> {
            while (true){
                try {
                    Integer j = queue.take();
                    System.out.println("Consumer took :" + j + " " + queue);
                    sleep(9000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

    }
}
