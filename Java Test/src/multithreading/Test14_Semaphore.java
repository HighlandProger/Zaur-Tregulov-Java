package multithreading;

import java.util.concurrent.Semaphore;

public class Test14_Semaphore {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        Person person1 = new Person("Alex", semaphore);
        Person person2 = new Person("John", semaphore);
        Person person3 = new Person("Elena", semaphore);
        Person person4 = new Person("Viktor", semaphore);
        Person person5 = new Person("Steve", semaphore);
    }
}
class Person extends Thread{
    String name;
    Semaphore callBox;
    public Person(String name, Semaphore callBox){
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name +" ждёт...");
            callBox.acquire();
            System.out.println(this.name + " пользуется телефоном");
            sleep(2000);
            System.out.println(this.name + " завершил(а) звонок");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callBox.release();
        }
    }
}
