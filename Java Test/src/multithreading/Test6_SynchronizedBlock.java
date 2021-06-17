package multithreading;

import support_elements.Student;

public class Test6_SynchronizedBlock {
    static final Object lock = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsApp());

        thread1.start();
        thread2.start();
        thread3.start();
    }

    void mobileCall(){
        synchronized (lock) {
            System.out.println(this);
            System.out.println("Mobile call started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ended");
        }
    }

    void skypeCall(){
        synchronized (lock) {
            System.out.println(this);
            System.out.println("Skype call started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ended");
        }
    }

    void whatsAppCall(){
        synchronized (lock) {
            System.out.println(this);
            System.out.println("WhatsApp call started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("WhatsApp call ended");
        }
    }

}

class RunnableImplMobile implements Runnable {
    public void run() {
        new Test6_SynchronizedBlock().mobileCall();
    }
}

class RunnableImplSkype implements Runnable {
    public void run() {
        new Test6_SynchronizedBlock().skypeCall();
    }
}

class RunnableImplWhatsApp implements Runnable {
    public void run() {
        new Test6_SynchronizedBlock().whatsAppCall();
    }
}