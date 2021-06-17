package multithreading;

public class Test3_ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnableTest3());

        System.out.println("Main begins");
        thread.start();
        thread.join(1000);//Wait for thread OR 1 second

        Thread.sleep(100);
        System.out.println("Main ends");
    }
}
class MyRunnableTest3 implements Runnable {
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ends");
    }
}
