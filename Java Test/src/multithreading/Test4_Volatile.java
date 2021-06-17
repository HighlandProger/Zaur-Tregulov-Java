package multithreading;

public class Test4_Volatile extends Thread{

    volatile boolean b = true; //Может длиться бесконечно без volatile

    @Override
    public void run() {
        int counter = 0;
        while (b){
            counter++;
        }
        System.out.println("End of cycle, counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Test4_Volatile thread = new Test4_Volatile();

        System.out.println("Start of program");
        thread.start();
        Thread.sleep(1000);
        thread.b = false;
        thread.join();
        System.out.println("End of program");
    }
}
