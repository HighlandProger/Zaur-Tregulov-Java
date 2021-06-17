package multithreading;

public class Test2_ThreadName_ThreadPriority {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.setName("FirstThread");

        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.setName("SecondThread");

        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);

        //FirstThread, priority:10
        System.out.println("name of thread: "+thread1.getName()+
                ", priority of thread: "+thread1.getPriority());

        //SecondThread, priority:1
        System.out.println("name of thread: "+thread2.getName()+
                ", priority of thread: "+thread2.getPriority());

        //main, priority: 5
        System.out.println("name of Main thread: "+Thread.currentThread().getName()+
                ", prioriry of Main thread: " + Thread.currentThread().getPriority());
    }
}

class MyThread extends Thread{
    public void run(){
    }
}