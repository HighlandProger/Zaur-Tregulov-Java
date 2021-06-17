package multithreading;

public class Test7_Wait_Notify {
    public static void main(String[] args) {
        Market market = new Market();
        Thread producer = new Thread(new Producer(market));
        Thread consumer = new Thread(new Consumer(market));

        producer.start();
        consumer.start();
    }
}

class Market {
    private int breadCount = 0;

    public synchronized void getBread() {
        while (breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("You've got a bread, bread count is: " + breadCount);
        notify();
    }

    public synchronized void putBread() {
        while (breadCount == 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println("You've put a bread, bread count is: " + breadCount);
        notify();
    }
}


class Producer implements Runnable{

    private Market market;

    public Producer(Market market){
        this.market = market;
    }

    @Override
    public void run() {
        for (int i =0; i<10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable{
    private Market market;

    public Consumer(Market market){
        this.market = market;
    }

    @Override
    public void run() {
        for (int i =0; i<10; i++) {
            market.getBread();
        }
    }
}