package multithreading;

public class Test3_ThreadSleep {
    public static void main(String[] args) {
        MyThread3 thread1 = new MyThread3();
        Thread thread2 = new Thread(new MyRunnable());


    }
}

class MyThread3 extends Thread{
    public void run(){

    }
}

class MyRunnable implements Runnable{
    public void run(){

    }
}