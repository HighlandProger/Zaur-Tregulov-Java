package multithreading;

import java.util.concurrent.Exchanger;

public class Test16_SELF {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        new PersonEx("Steve",  exchanger);
        new PersonEx("Maga", exchanger);
        new PersonEx("John", exchanger);
        new PersonEx("Elena",  exchanger);

    }
}

class PersonEx extends Thread{
    private String name;
    private Exchanger <String> exchanger;


    public PersonEx(String name, Exchanger<String> exchanger) {
        this.name = name;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoSee (String opponentName){
        System.out.println(name + " see " + opponentName);
    }

    @Override
    public void run() {
        String opponentName;
        try {
            opponentName = exchanger.exchange(name); //getting data from another thread
            whoSee(opponentName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}