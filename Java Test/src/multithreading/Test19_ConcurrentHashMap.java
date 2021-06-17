package multithreading;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Test19_ConcurrentHashMap {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1, "Ivan");
        map.put(2, "Oleg");
        map.put(3, "Igor");
        map.put(4, "Alex");
        map.put(5, "Steve");

        System.out.println(map);

        Runnable runnable1 = () -> {
            //No need to synchronize Iterator!!! It's ConcurrentHashMap
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i = iterator.next();
                String name = map.get(i);
                System.out.println(i + ":" +name);
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(6, "Peter");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(map);
    }
}
