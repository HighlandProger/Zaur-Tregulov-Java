package multithreading;

public class Test5_Synchronized {


    public static void main(String[] args) {
        MyRunnable2 runnable = new MyRunnable2();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    static int count = 0;
}


    class MyRunnable1 implements Runnable{
        public synchronized void increment(){
            Counter.count++;
            System.out.print(Counter.count + " ");
        }

        public void run(){
            for(int i = 0; i<3; i++){
                increment();
            }
        }
    }

