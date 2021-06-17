package multithreading;

public class Test3_ThreadState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnableTest3State());
        System.out.println(thread.getState());

        thread.start();
        System.out.println(thread.getState());

        thread.join();
        System.out.println(thread.getState());
    }
}
class MyRunnableTest3State implements Runnable {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}