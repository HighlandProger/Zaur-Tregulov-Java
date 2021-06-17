package multithreading;

public class Test10_Daemon {
    public static void main(String[] args) {
        System.out.println("Main thread starts");

        UserThread user = new UserThread();
        user.setName("user_thread");

        DaemonThread daemon = new DaemonThread();
        daemon.setName("daemon_thread");
        daemon.setDaemon(true);

        user.start();
        daemon.start();

        System.out.println("Main thread ends");
    }
}

class UserThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is daemon: " + isDaemon());
        for (char i = 'A'; i <='J'; i++){
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class DaemonThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is daemon: " + isDaemon());
        for (int i = 1; i <=1000; i++){
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}