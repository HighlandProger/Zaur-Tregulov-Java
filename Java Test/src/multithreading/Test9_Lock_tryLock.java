package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test9_Lock_tryLock {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Employee employee1 = new Employee("Alex", lock);
        Employee employee2 = new Employee("Oleg", lock);
        Employee employee3 = new Employee("Elena", lock);
        Thread.sleep(3000);
        Employee employee4 = new Employee("Jina", lock);
        Employee employee5 = new Employee("Jason", lock);
    }

}
class Employee extends Thread{

    private Lock lock;
    String name;

    public Employee(String name, Lock lock){
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock())
        try {
            System.out.println(name + " is using ATM");
            Thread.sleep(2000);
            System.out.println(name + " ended using ATM");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
        else {
            System.out.println(name + " doesn't want to wait in queue");
        }
    }
}