package multithreading;

public class Test1_Creating {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
//        MyThread2 thread2 = new MyThread2(); Нельзя, не работает так
        Thread thread2 = new Thread(new MyThread2());
        thread1.start();
        thread2.start();

        new Thread(() -> System.out.println("privet")).start();
    }
}
//extends
class MyThread1 extends Thread {
    public void run(){
        for (int i=0; i<100; i++){
            System.out.println(i);
        }
    }
}

//implements
class MyThread2 implements Runnable {
    public void run() {
        for (int i=10; i>0; i--){
            System.out.println(i);
        }
    }
}
