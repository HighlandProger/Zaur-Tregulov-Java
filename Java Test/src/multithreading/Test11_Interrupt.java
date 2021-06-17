package multithreading;

public class Test11_Interrupt {
    public static void main(String[] args) throws InterruptedException {
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(100);
        thread.interrupt();
    }
}

class InterruptedThread extends Thread{
    @Override
    public void run() {

            for (int i = 0; i < 1000000; i++){
                if (isInterrupted()) {
                    System.out.println("thread is interrupted");
                    return;
                }
                System.out.println(i);
            }
    }
}