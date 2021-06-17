package multithreading;

public class Test6_Monitor {

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

class Counter2 {
    static int count = 0;
}


class MyRunnable2 implements Runnable{

    volatile static int count = 0;

    public void doWork1(){
        synchronized(this) {
            Counter2.count++;
            System.out.print(Counter2.count + " ");
        }
    }

    public static void doWork2(){
        synchronized (MyRunnable2.class){
            count++;
        }
    }

    @Override
    public void run() {
        for(int i = 0; i<3; i++){
            doWork1();
        }
    }
}
